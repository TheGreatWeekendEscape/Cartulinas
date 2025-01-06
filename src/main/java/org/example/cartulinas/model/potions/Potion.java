package org.example.cartulinas.model.potions;

import org.example.cartulinas.model.characters.Character;

public abstract class Potion {

    protected String name;

    protected abstract void activate(Character c);

}
