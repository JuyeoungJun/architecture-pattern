package com.pattern.decorator;

public abstract class Ingredient extends Hamburger {

    public Hamburger hamburger;

    public Ingredient(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public String getPrevHamburger() {
        return hamburger.getCurrentIngredient();
    }

}
