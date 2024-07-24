package com.scm.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String userId;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 1000)
    private String about;

    private String profilePicture;
    private String phoneNumber;

    //verification information
    private Boolean enabled = false;
    private Boolean emailVerified = false;
    private Boolean phoneVerified = false;

    //Provider ie .. google , signup , linkdin etc
    private Providers provider = Providers.SELF;
    private String providerUserId;

    //add more field and contact mapping
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch =
            FetchType.LAZY, orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();


}
