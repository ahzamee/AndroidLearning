package com.ewu.androidpractice.model;

public class Datamodel {

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String name;
    String Email;
    String phoneNumber;
}
