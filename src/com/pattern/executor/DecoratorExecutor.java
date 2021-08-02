package com.pattern.executor;

import com.pattern.decorator.Bread;
import com.pattern.decorator.BulgogiPatty;
import com.pattern.decorator.Hamburger;
import com.pattern.decorator.ShrimpsPatty;

public class DecoratorExecutor implements Executor{

    @Override
    public void execute() {
        Hamburger hamburger = new Bread();
        System.out.println(hamburger.getCurrentIngredient());

        hamburger = new BulgogiPatty(hamburger);
        System.out.println(hamburger.getCurrentIngredient());;

        hamburger = new ShrimpsPatty(hamburger);
        System.out.println("current: " + hamburger.getCurrentIngredient());
        System.out.println("prev: " + ((ShrimpsPatty)hamburger).getPrevHamburger());

        hamburger = new BulgogiPatty(hamburger);
        System.out.println("current: " + hamburger.getCurrentIngredient());
        System.out.println("prev: " + ((BulgogiPatty)hamburger).getPrevHamburger());
    }
}
