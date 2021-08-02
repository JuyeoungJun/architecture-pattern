package com.pattern.observer;

import java.util.ArrayList;

public abstract class Generator {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract String getString();
    public abstract void execute();

}
