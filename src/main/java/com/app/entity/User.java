package com.app.entity;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String password;
    private String nickName;
    private String email;
    private String phoneNumber;
    private String website;
    private boolean active;

    public User() {
    }

    public User(String userName, String password, String nickName, String email, String phoneNumber, String website, boolean active) {
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
