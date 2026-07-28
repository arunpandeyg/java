package com.apsba.apsba.registration;

import com.apsba.apsba.user.Role;
import lombok.Data;

import java.util.List;


@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Role> roles;
}