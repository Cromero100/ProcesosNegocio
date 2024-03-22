package com.process.shop.model;

import com.process.shop.model.Enum.DocumentType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Builder
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private LocalDate birthDate;
    private DocumentType documentTypeType;
    private String cc;
    private String phoneNumber;
    private String email;
    private String password;
    //private List<Address> address;
}
