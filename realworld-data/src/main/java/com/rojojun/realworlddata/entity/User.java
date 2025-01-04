package com.rojojun.realworlddata.entity;

import jakarta.persistence.*;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String username;

    private String email;

    private String password;

    private User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    protected User() {}

    public static User of(String username, String email, String password) {
        return new User(username, email, password);
    }
}
