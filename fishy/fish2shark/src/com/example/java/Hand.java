package com.example.java;

public class Hand {
    private Card card1, card2;

    //Constructor of the hand of a player taking in parameters his 2 cards
    public Hand(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public Card getCard1() {
        return card1;
    }

    public Card getCard2() {
        return card2;
    }
}
