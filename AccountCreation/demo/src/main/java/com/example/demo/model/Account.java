package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerNumber;

    @NotEmpty(message = "Customer name is required")
    private String customerName;

    @NotEmpty(message = "Customer mobile is required")
    private String customerMobile;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Customer email is required")
    private String customerEmail;

    @NotEmpty(message = "Address1 is required")
    private String address1;

    private String address2;

    @NotNull(message = "Account type is required")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    // Getters and Setters
}

enum AccountType {
    S, C
}
