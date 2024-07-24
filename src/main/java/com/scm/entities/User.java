package com.scm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String userId;

    @Column(name = "user_name" , nullable = false)
    private String name;

    @Column(unique = true , nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 10000)
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


}
