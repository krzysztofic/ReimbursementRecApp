package com.krzysztofic.model;

public class User {

    private Long id;
    private String name;
    private String login;
    private String password;
    private Status status;

    public User(Long id, String name, String login, String password, Status status) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.status = status;
    }
}