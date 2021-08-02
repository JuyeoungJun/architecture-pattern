package com.pattern.observer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringGenerator extends Generator {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    private String message;

    @Override
    public String getString() {
        return this.message;
    }

    @Override
    public void execute() {

        while (true) {
            try {
                message = in.readLine();
                notifyObservers();
            } catch (Exception e) { }
        }
    }
}
