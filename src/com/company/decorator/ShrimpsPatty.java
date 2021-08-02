package com.company.decorator;

public class ShrimpsPatty extends Ingredient {

    public ShrimpsPatty(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String getCurrentIngredient() {
        return hamburger.getCurrentIngredient() + " + " + "새우 패티";
    }
}
