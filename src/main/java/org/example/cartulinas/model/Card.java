package org.example.cartulinas.model;

import java.util.Random;

public class Card {

    private String rank;
    private Suit suit;
    private int value;

    public Card(String rank) {
        this.rank = rank;
        this.suit = getRandSuit();
        this.value = getCardValue();
    }

    private Suit getRandSuit() {
        Random rand = new Random();
        int randNum = rand.nextInt(4) + 1;

        switch (randNum) {
            case 1:
                return Suit.HEARTS;
            case 2:
                return Suit.DIAMONDS;
            case 3:
                return Suit.SPADES;
            case 4:
                return Suit.CLUBS;
            default:
                return null;
        }
    }

    public int getCardValue() {
        switch (rank) {
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": return 10;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "As": return 15;
            default: return 815;
        }
    }

    @Override
    public String toString() {
        return rank + " de " + suit.getName();
    }

    public String getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}
