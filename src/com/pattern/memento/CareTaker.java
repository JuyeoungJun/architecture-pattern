package com.pattern.memento;

import java.util.Stack;

public class CareTaker {

    Stack<Memento> stack = new Stack<>();

    public void push(Memento memento) {
        stack.push(memento);
    }

    public Memento pop() {
        return stack.pop();
    }

}
