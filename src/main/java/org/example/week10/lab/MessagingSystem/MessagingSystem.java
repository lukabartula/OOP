package org.example.week10.lab.MessagingSystem;

import org.example.week10.lab.MessagingSystem.annotations.CanSendMessage;
import org.example.week10.lab.MessagingSystem.annotations.RequiresPermission;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission(1)
    public void sendMessage(User user){
        System.out.println(user.getUsername() + " is restricted!");
    }

    @CanSendMessage
    @RequiresPermission(2)
    public void sendMessage (Admin admin, String message){
        System.out.println(admin.getUsername() + " sent a message: " + message);
    }
}
