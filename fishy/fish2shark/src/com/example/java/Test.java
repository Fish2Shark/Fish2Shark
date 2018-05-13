package com.example.java;


import java.util.List;

public class Test {

    // Ajoute toutes les combinaisons de paires possibles
    private void addPeers(int i, List<Hand> opponentHand){
        Card card1 = new Card(i,"Heart");
        Card card2 = new Card(i,"Diamond");
        Card card3 = new Card(i,"Spade");
        Card card4 = new Card(i,"Club");
        Hand hand1 = new Hand(card1, card2);
        Hand hand2 = new Hand(card1, card3);
        Hand hand3 = new Hand(card1, card4);
        Hand hand4 = new Hand(card2, card3);
        Hand hand5 = new Hand(card2, card4);
        Hand hand6 = new Hand(card3, card4);
        opponentHand.add(hand1);
        opponentHand.add(hand2);
        opponentHand.add(hand3);
        opponentHand.add(hand4);
        opponentHand.add(hand5);
        opponentHand.add(hand6);
    }

    private void addCombosSameColor(int value1, int value2, List<Hand> opponentHand){
        Card card1 = new Card(value1, "Heart");
        Card card2 = new Card(value2, "Heart");
        Card card3 = new Card(value1, "Diamond");
        Card card4 = new Card(value2, "Diamond");
        Card card5 = new Card(value1, "Spade");
        Card card6 = new Card(value2, "Spade");
        Card card7 = new Card(value1, "Club");
        Card card8 = new Card(value2, "Club");
        Hand hand1 = new Hand(card1, card2);
        Hand hand2 = new Hand(card3, card4);
        Hand hand3 = new Hand(card5, card6);
        Hand hand4 = new Hand(card7, card8);
        opponentHand.add(hand1);
        opponentHand.add(hand2);
        opponentHand.add(hand3);
        opponentHand.add(hand4);
    }

    private void addCombos(int value1, int value2, List<Hand> opponentHand){
        Card card1 = new Card(value1, "Heart");
        Card card2 = new Card(value2, "Heart");
        Card card3 = new Card(value1, "Diamond");
        Card card4 = new Card(value2, "Diamond");
        Card card5 = new Card(value1, "Spade");
        Card card6 = new Card(value2, "Spade");
        Card card7 = new Card(value1, "Club");
        Card card8 = new Card(value2, "Club");

        Hand hand2 = new Hand(card1, card4);
        Hand hand3 = new Hand(card1, card6);
        Hand hand4 = new Hand(card1, card8);

        Hand hand5 = new Hand(card3, card2);
        Hand hand6 = new Hand(card3, card6);
        Hand hand7 = new Hand(card3, card8);

        Hand hand8 = new Hand(card5, card2);
        Hand hand9 = new Hand(card5, card4);
        Hand hand10 = new Hand(card5, card8);

        Hand hand11 = new Hand(card7, card2);
        Hand hand12 = new Hand(card7, card4);
        Hand hand13 = new Hand(card7, card6);

        opponentHand.add(hand2);
        opponentHand.add(hand3);
        opponentHand.add(hand4);
        opponentHand.add(hand5);
        opponentHand.add(hand6);
        opponentHand.add(hand7);
        opponentHand.add(hand8);
        opponentHand.add(hand9);
        opponentHand.add(hand10);
        opponentHand.add(hand11);
        opponentHand.add(hand12);
        opponentHand.add(hand13);
    }

    public void addHandToList(List<Hand> opponentHand, int[] handToAdd) {
        int i, limite;
        // if the hand is a peer
        if (handToAdd[0] == handToAdd[1]) {
            if (handToAdd[2] == 14) {
                for(i = handToAdd[0]; i <= 13; i++){
                    addPeers(i, opponentHand);
                }
                //Ajoute toutes les paires d'as
                addPeers(1, opponentHand);
            } else {
                addPeers(handToAdd[0], opponentHand);

            }
            // if the hand is not a peer
        } else {
            // if the cards have the same color
            if (handToAdd[2] == 15) {
                // if the combos must be calculated until the end
                if (handToAdd[3] == 14) {

                    if (handToAdd[0] == 1){
                        limite = 13;
                    }
                    else
                        limite = handToAdd[0];

                    for(i = handToAdd[1]; i < limite; i++){
                        addCombosSameColor(handToAdd[0], i, opponentHand);
                    }
                } else {
                    addCombosSameColor(handToAdd[0], handToAdd[1], opponentHand);
                }
                // if the cards have different colors
            } else if (handToAdd[2] == 16) {
                if (handToAdd[3] == 14) {
                    if (handToAdd[0] == 1){
                        limite = 13;
                    }
                    else
                        limite = handToAdd[0];

                    for(i = handToAdd[1]; i < limite; i++){
                        addCombos(handToAdd[0], i, opponentHand);
                    }
                } else{
                    addCombos(handToAdd[0], handToAdd[1], opponentHand);
                }
            }
        }
    }
}
