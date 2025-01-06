package org.example.cartulinas.model.potions;

import org.example.cartulinas.model.characters.Character;

public class HealthPotion extends Potion {

    private int healing = 10;

    public HealthPotion() {
        this.name = "Poción de vida";
    }

    @Override
    protected void activate(Character c) {
        c.heal(healing);
    }
}
