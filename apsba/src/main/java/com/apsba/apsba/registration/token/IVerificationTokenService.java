package com.apsba.apsba.registration.token;

import com.apsba.apsba.user.User;

import java.util.Optional;



public interface IVerificationTokenService {
    String validateToken(String token);
    void saveVerificationTokenForUser(User user, String token);
    Optional<VerificationToken> findByToken(String token);


    void deleteUserToken(Long id);
}
