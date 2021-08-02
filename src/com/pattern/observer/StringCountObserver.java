package com.pattern.observer;

public class StringCountObserver implements Observer {

    int count;

    @Override
    public void update(Generator generator) {
        count = generator.getString().length();
        System.out.println("String Count Observer: " + count);
    }
}
