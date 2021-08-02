package com.pattern.executor;

import com.pattern.memento.CareTaker;
import com.pattern.memento.Information;

public class MementoExecutor implements Executor{

    @Override
    public void execute() {
        Information information = new Information("Test1", 5);
        CareTaker careTaker = new CareTaker();

        careTaker.push(information.createMemento());

        information.setData1("Test2");
        information.setData2(10);

        System.out.println("now data1: " + information.getData1());
        System.out.println("now data2: " + information.getData2());

        information.restoreMemento(careTaker.pop());

        System.out.println("prev data1: " + information.getData1());
        System.out.println("prev data2: " + information.getData2());
    }
}
