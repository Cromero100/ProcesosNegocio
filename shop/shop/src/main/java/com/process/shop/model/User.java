package com.process.shop.model;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private String fullName;
    private Date birthDate;
    private String ccType;
    private String cc;
    private String phoneNumber;
    private String mail;
    private String password;
    private String address;
}
