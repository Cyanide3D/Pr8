package com.company.mediator;

public class Main {

    public static void main(String[] args) {
        SimpleTextChat textChat = new SimpleTextChat();
        User admin = new Admin(textChat, "Admin");
        User user1 = new SimpleUser(textChat, "User1");
        User user2 = new SimpleUser(textChat, "User2");
        User user3 = new SimpleUser(textChat, "User3");

        textChat.setAdmin(admin);
        textChat.addUserToChat(user1);
        textChat.addUserToChat(user2);
        textChat.addUserToChat(user3);

        user1.sendMessage("Hello world!");
    }

}
