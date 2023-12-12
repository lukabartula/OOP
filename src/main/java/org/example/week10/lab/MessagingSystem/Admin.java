package org.example.week10.lab.MessagingSystem;

import org.example.week10.lab.MessagingSystem.annotations.RequiresPermission;

@RequiresPermission(2)
public class Admin {
    private String username;

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
