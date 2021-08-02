package com.company.executor;

import com.company.decorator.Bread;
import com.company.decorator.BulgogiPatty;
import com.company.decorator.Hamburger;
import com.company.decorator.ShrimpsPatty;

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
