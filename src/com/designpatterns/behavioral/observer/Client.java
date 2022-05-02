package com.designpatterns.behavioral.observer;

public class Client implements Observer{

    private String name;
    private String email;
    private Subject subject;

    public Client(String name, String email, Subject subject) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String message) {
        Email.sendEmail(this, message);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
