package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this.message));
    }

    public void addMessage(String message) {
        this.message = message;
        this.notifyObservers();
    }
}
