package com.udacity.jwdnd.cl.review.model;

public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String salt;
    private String password;
    private Integer userId;

    public User(String firstName, String lastName,
                String username, String salt, String password,Integer userId) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.password = password;
        this.salt = salt;
        this.username = username;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
