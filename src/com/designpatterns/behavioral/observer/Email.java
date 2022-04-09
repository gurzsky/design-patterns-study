package com.designpatterns.behavioral.observer;

public class Email {

    public static void sendEmail(Observer observer, String message) {

        System.out.println("-------------------------------------");
        System.out.println("Sending email to " + observer.getName() + " - " + observer.getEmail());
        System.out.println("Message: " + message);
    }
}
