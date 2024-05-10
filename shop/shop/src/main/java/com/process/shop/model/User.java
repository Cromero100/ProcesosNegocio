package com.process.shop.model;

import com.process.shop.model.Enum.DocumentType;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Please provide a username")
    @Size(min = 10, max = 200)
    private String fullName;
    private LocalDate birthDate;
    @NotBlank(message = "Please provide a document")
    @Size(min = 5, max = 10)
    private String cc;
    private String documentType;
    private String phoneNumber;
    @NotNull(message = "Please provide the email")
    @Email(message = "Pleas provide a email valid")
    private String email;
    @NotNull(message = "Please provide the password")
    @Size(min = 8, max = 15)
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Address> address;
}
