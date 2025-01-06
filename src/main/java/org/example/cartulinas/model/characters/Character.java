package org.example.cartulinas.model.characters;


import org.example.cartulinas.model.Card;
import org.example.cartulinas.model.Deck;

import java.util.ArrayList;
import java.util.Random;


public abstract class Character {

    protected String name;
    protected Deck deck;
    protected int hp;
    protected int maxHp;
    protected int gold;

    protected int getStartingGold() {
        Random rand = new Random();
        int randNum = rand.nextInt(2) - 2;
        return randNum + this.maxHp;
    }

    public boolean loseHp(int amount) {
        this.hp -= amount;
        return this.hp <= 0;
    }

    public int calculateHandValue(ArrayList<Card> cards) {
        int handValue = 0;
        for (Card c : cards) {
            handValue += c.getCardValue();
        }
        return handValue;
    }

    public int heal(int amount) {
        if ((this.hp + amount) > this.maxHp) {
            this.hp = this.maxHp;
            return this.maxHp - amount;
        } else {
            this.hp += amount;
            return amount;
        }
    }

    public Card getRandCard() {
        return this.deck.getRandCard();
    }

    public String getName() {
        return name;
    }

    public Deck getDeck() {
        return deck;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getGold() {
        return gold;
    }
}
