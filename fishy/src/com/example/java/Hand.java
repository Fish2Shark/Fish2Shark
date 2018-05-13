package com.example.java;

public class Hand {
    Card card1, card2;
    private int combo;

    //Constructor of the hand taking in parameters his 2 cards
    public Hand(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
    }
    //Count and tell if the hand is suited
    /*public boolean isSuit(Card card1, Card card2){
        if(card1.compareValueTo(card2)!=0) {
            if (card1.compareColorTO(card2) == 0) {
                this.combo += 4;
                System.out.println(combo);
                return true;
            } else return false;
        } else return false;
    }*/
    //Avec la range adverse on compte le nombre de combo pour l'instant on
}
