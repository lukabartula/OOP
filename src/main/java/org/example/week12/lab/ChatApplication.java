package org.example.week12.lab;

class ChatApplication {
    public static void main(String[] args) {
        ChatServer newChatServer = new ChatServer();
        newChatServer.start(1111);
    }
}
