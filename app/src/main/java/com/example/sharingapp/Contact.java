package com.example.sharingapp;

import java.util.UUID;

public class Contact {

    public String username;
    public String email;
    public String id;

    public Contact(String username, String email, String id ) {
        this.username = username;
        this.email = email;
        if (id == null) {
            setId();
        } else {
            updateId(id);
        }
    }

    public String getUsername()
    {
        return username;
    }

    public  String getEmail()
    {
        return email;
    }

    public  String getId()
    {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public void updateId(String id)
    {
        this.id = id;
    }
}
