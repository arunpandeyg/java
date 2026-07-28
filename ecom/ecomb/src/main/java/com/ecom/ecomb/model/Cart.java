package com.ecom.ecomb.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private User user;

    private Set<CartItems> cartItems = new HashSet<CartItems>();
    private double totalSellingPrice;
    private int totalItems;
    private int totalMrpPrice;
    private int discount;
    private String couponCode;
}
