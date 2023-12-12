package org.example.week10.lab.MessagingSystem;

import org.example.week10.lab.MessagingSystem.annotations.RequiresPermission;

@RequiresPermission(1)
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
