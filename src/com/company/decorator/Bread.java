package com.company.decorator;

public class Bread extends Hamburger {

    public String currentIngredient = "빵";

    @Override
    public String getCurrentIngredient() {

        return currentIngredient;
    }
}
