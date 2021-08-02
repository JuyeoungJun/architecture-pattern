package com.pattern.observer;

public class StringObserver implements Observer{

    private String message;

    @Override
    public void update(Generator generator) {
        message = generator.getString();
        System.out.println("String Observer: " + message);
    }
}
