package com.example.java;

public class Card {

    int value;
    String color;

    //Constructor of Card
    public Card(int value, String color) {
        this.value = value;
        this.color = color;
    }
    //Method that compare the value of 2 cards
    public int compareValueTo(Card card1) {
        if (this.value > card1.value) return 1;
        else if (this.value == card1.value) return 0;
        else return -1;
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }
    //Method that compare the color of 2 cards
    public int compareColorTO(Card card1) {
        return this.color.compareTo(card1.color);
    }
}

