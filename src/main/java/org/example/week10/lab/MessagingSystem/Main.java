package org.example.week10.lab.MessagingSystem;

public class Main {
    public static void main(String[] args) {
        MessagingSystem messagingSystem = new MessagingSystem();

        User regularUser = new User("Luka");
        messagingSystem.sendMessage(regularUser);

        Admin admin = new Admin("Administrator");
        messagingSystem.sendMessage(admin, "Cao cao zdravo");
    }
}
