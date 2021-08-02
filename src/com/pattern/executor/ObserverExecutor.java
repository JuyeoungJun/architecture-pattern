package com.pattern.executor;

import com.pattern.observer.StringGenerator;

public class ObserverExecutor implements Executor{


    @Override
    public void execute() {
        StringGenerator stringGenerator = new StringGenerator();

        stringGenerator.execute();
    }
}
