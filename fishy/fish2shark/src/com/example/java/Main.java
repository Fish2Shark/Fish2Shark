package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int i = 0, j = 0;
        Test test = new Test();
        //List opponentHand = new LinkedList();
        ArrayList<Hand> opponentHand = new ArrayList<Hand>();
        int arrayCombo[] = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter opponent range : ");
        String userInput = scanner.nextLine();
        String[] usableInput = userInput.split("");
        int l = 0;
        while (!usableInput[i].equals(".")) {
            for (int k = 0; k < 4; k++) arrayCombo[k] = 0;
            l = 0;
            while (!usableInput[i].equals(".") && !usableInput[i].equals(",")) {
                if (usableInput[i].equals("A")) arrayCombo[l] = 1;
                if (usableInput[i].equals("2")) arrayCombo[l] = 2;
                if (usableInput[i].equals("3")) arrayCombo[l] = 3;
                if (usableInput[i].equals("4")) arrayCombo[l] = 4;
                if (usableInput[i].equals("5")) arrayCombo[l] = 5;
                if (usableInput[i].equals("6")) arrayCombo[l] = 6;
                if (usableInput[i].equals("7")) arrayCombo[l] = 7;
                if (usableInput[i].equals("8")) arrayCombo[l] = 8;
                if (usableInput[i].equals("9")) arrayCombo[l] = 9;
                if (usableInput[i].equals("T")) arrayCombo[l] = 10;
                if (usableInput[i].equals("J")) arrayCombo[l] = 11;
                if (usableInput[i].equals("Q")) arrayCombo[l] = 12;
                if (usableInput[i].equals("K")) arrayCombo[l] = 13;
                if (usableInput[i].equals("+")) arrayCombo[l] = 14;
                if (usableInput[i].equals("s")) arrayCombo[l] = 15;
                if (usableInput[i].equals("o")) arrayCombo[l] = 16;
                l++;
                i++;
            }
            test.addHandToList(opponentHand, arrayCombo);
            if (!usableInput[i].equals("."))
                i++;
            j++;
        }
        for (Hand hand : opponentHand) {
            System.out.println(hand.getCard1().getValue() + hand.getCard1().getColor() + hand.getCard2().getValue() + hand.getCard2().getColor());
        }
    }


}
