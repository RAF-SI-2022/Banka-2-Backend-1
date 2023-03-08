package com.raf.si.Banka2Backend.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(
        name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 50)
    @Email
    private String email;

    @NotNull
    @Size(max = 20)
    private String password;

    @NotNull
    @Size(max = 20)
    private String firstName;

    @NotNull
    @Size(max = 20)
    private String lastName;

    @NotNull
    @Size(max = 13)
    private String jmbg;

    @NotNull
    @Size(max = 20)
    private String pozicija;

    private boolean aktivan;

    //TODO: add all user attributes, add jpa annotations
}