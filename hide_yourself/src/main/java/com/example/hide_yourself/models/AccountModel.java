package com.example.hide_yourself.models;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountModel {

    @Id
    private Long userId;
    private String username;
    private String password;
    private String email;
    private Timestamp createdOn;
    private Timestamp lastLogin;

    public AccountModel(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdOn = new Timestamp(System.currentTimeMillis());
    }
}
