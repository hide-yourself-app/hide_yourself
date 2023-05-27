package com.example.hide_yourself.models;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserWebsite {
    private Long userId;
    private String website;
    private String websiteLoginEmail;
    private String websiteLoginPassword;
}
