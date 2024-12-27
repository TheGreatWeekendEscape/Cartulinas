package org.example.cartulinas.model.characters;

import org.example.cartulinas.model.Deck;
import org.example.cartulinas.model.Card;

public class Elcartero extends Character {

    public Elcartero() {
        super();
        this.name = "EL CARTERO";
        this.deck = new Deck();
        this.deck.addCard(new Card("2"));
        this.deck.addCard(new Card("3"));
        this.deck.addCard(new Card("4"));
        this.deck.addCard(new Card("5"));
        this.deck.addCard(new Card("6"));
        this.deck.addCard(new Card("7"));
        this.deck.addCard(new Card("8"));
        this.deck.addCard(new Card("9"));
        this.deck.addCard(new Card("10"));
        this.deck.addCard(new Card("J"));
        this.deck.addCard(new Card("Q"));
        this.deck.addCard(new Card("K"));
        this.deck.addCard(new Card("As"));

        this.maxHp = 20;
        this.hp = maxHp;
        this.gold = 0;
    }
}
