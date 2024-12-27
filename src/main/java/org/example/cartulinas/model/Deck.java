package org.example.cartulinas.model;

import java.util.ArrayList;
import java.util.Random;


public class Deck {
    private ArrayList<Card> cards = new ArrayList();

    public Deck() {

    }

    public void addCard(Card c) {
        cards.add(c);
    }

    public Card getRandCard() {
        Random random = new Random();
        int rand = random.nextInt(cards.size());
        return cards.get(rand);
    }
}
