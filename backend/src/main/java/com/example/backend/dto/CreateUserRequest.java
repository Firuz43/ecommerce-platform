package com.example.backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateUserRequest {
    
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid emai format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    @NotBlank(message = "First name is required")
    @Size(max = 100, message = "First name too long")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 100, message = "Last name too long")
    private String lastName;


    @Size(max = 20, message = "Phone number too long")
    private String phone;
}
