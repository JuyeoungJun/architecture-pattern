package com.pattern.decorator;

public class BulgogiPatty extends Ingredient {

    public BulgogiPatty(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String getCurrentIngredient() {
        return hamburger.getCurrentIngredient() + " + " + "불고기 패티";
    }
}
