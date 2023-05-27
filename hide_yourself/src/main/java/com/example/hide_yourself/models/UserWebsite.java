package com.example.hide_yourself.models;

public class UserWebsite {
    private long userId;
    private String website;
    private String websiteLoginEmail;
    private String websiteLoginPassword;

    public UserWebsite() {}

    public UserWebsite(Account account, String website, String websiteLoginEmail) {
        this.userId = account.getUserId();
        this.website = website;
        this.websiteLoginEmail = websiteLoginEmail;
    }

    public UserWebsite(Account account, String website, String websiteLoginEmail, String websiteLoginPassword) {
        this.userId = account.getUserId();
        this.website = website;
        this.websiteLoginEmail = websiteLoginEmail;
        this.websiteLoginPassword = websiteLoginPassword;
    }

    public long getUserId() {
        return this.userId;
    }

    public String getWebsite() {
        return this.website;
    }

    public String getWebsiteLoginEmail() {
        return this.websiteLoginEmail;
    }

    public void setWebsiteLoginEmail(String websiteLoginEmail) {
        this.websiteLoginEmail = websiteLoginEmail;
    }

    public String getWebsiteLoginPassword() {
        return this.websiteLoginPassword;
    }

    public void setWebsiteLoginPassword(String password) {
        this.websiteLoginPassword = password;
    }
}
