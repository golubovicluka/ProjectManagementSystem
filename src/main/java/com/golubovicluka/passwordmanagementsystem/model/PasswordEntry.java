package com.golubovicluka.passwordmanagementsystem.model;

public class PasswordEntry {
    private String username;
    private String password;
    private String website;
    private int id;
    private String websiteUrl;

    public PasswordEntry(String username, String password, String website) {
        this.username = username;
        this.password = password;
        this.website = website;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }
}