package org.example.cartulinas.model;

public enum Suit {
    HEARTS("\u001B[31mCorazones\u001B[0m"),
    DIAMONDS("\u001B[31mDiamantes\u001B[0m"),
    SPADES("\u001B[30mPicas\u001B[0m"),
    CLUBS("\u001B[30mTréboles\u001B[0m");

    private final String name;

    Suit(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
}
