package com.apbs.apbsp.jwt;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;


@Component
public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

//    @Value("${spring.app.jwtSecret}")
    private String jwtSecret="secretwtuqpowetwwmvzm90834309SJDZM90834309dskjal'gHD]ppewute;HFSDHFWI" ;
//    @Value("${spring.app.jwtExpirationMs}")
    private Long jwtExpirationMs = Long.valueOf("84600000");

    //getting jwt token
    String getJwtFormHeader(HttpServletRequest request){
        String bearerToken = request.getHeader("Authorization");
        logger.debug("Authorization header: {}", bearerToken);
        if(bearerToken != null && !bearerToken.startsWith("Bearer ")){
            return bearerToken.substring(7);
        }
        return null;
    }
    //generating token
    public String generateTokenFromUsername(UserDetails userDetails){
        String username = userDetails.getUsername();
        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(new Date().getTime() + jwtExpirationMs))
                .signWith(key())
                .compact();
    }

    //getting username from jwt token
    public String getUsernameFromJwtToken(String Token){
        return Jwts.parser()
                .verifyWith((SecretKey) key())
                .build().parseSignedClaims(Token)
                .getPayload()
                .getSubject();
    }

    //key
    private Key key() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

    public boolean validateJwtToken(String authToken){
        try{
            System.out.println("Validate token");
            Jwts.parser().verifyWith((SecretKey) key()).build().parseSignedClaims(authToken);
            return true;

        }catch(MalformedJwtException e){
            logger.error("Invalid Jwt token: {}", e.getMessage());
        }catch(ExpiredJwtException e){
            logger.error("Expired Jwt token: {}", e.getMessage());
        }catch(UnsupportedJwtException e){
            logger.error("Unsupported Jwt token: {}", e.getMessage());
        }catch(IllegalArgumentException e){
            logger.error("Illegal empty Jwt token: {}", e.getMessage());
        }
        return false;
    }

}
