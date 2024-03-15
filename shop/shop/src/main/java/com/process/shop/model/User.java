package com.process.shop.model;

import com.process.shop.model.Enum.DocumentType;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class User {
    private String fullName;
    private Date birthDate;
    private DocumentType documentTypeType;
    private String cc;
    private String phoneNumber;
    private String mail;
    private String password;
    private List<Address> address;
}
