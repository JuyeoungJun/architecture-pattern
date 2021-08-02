package com.pattern;

import com.pattern.executor.DecoratorExecutor;
import com.pattern.executor.Executor;
import com.pattern.executor.MementoExecutor;
import com.pattern.executor.ObserverExecutor;
import com.pattern.executor.VisitorExecutor;

public class Main {

    public static void main(String[] args) throws Exception {

        String pattern = args[0];

        Executor executor = null;

        if (pattern.equals("decorator")) {
            executor = new DecoratorExecutor();
        } else if (pattern.equals("memento")) {
            executor = new MementoExecutor();
        } else if (pattern.equals("observer")) {
            executor = new ObserverExecutor();
        } else if (pattern.equals("visitor")) {
            executor = new VisitorExecutor();
        }

        executor.execute();

    }
}
