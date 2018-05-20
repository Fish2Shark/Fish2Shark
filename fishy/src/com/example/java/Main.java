package com.example.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fenetre fenetre = new fenetre();
        ArrayList<Hand> opponentHand = new ArrayList<Hand>();
        Strength strength = new Strength();


        //9c As 2d
        /*Card card1 = new Card(3,"Club");
        Card card2 = new Card(5,"Club");
        Card card3 = new Card(7,"Diamond");

        Flop flop1 = new Flop(card1,card2,card3);
        BoardEvaluate boardEvaluate = new BoardEvaluate();
        Evaluate evaluate = new Evaluate();
        //boardEvaluate.isRainbow( flop1 );
        //boardEvaluate.isPairedBoard( flop1 );
        boardEvaluate.isDry( flop1 );
        boardEvaluate.isSemiConnected( flop1 );
        boardEvaluate.isConnected( flop1 );


        Card card4 = new Card(8,"Diamond");
        Card card5 = new Card(7,"Heart");
        Hand hand1 = new Hand(card4,card5);
        strength.countBP( flop1,hand1 );
        strength.countOE(flop1,hand1);
        strength.countTP( flop1,hand1 );
        System.out.println(strength.getOE());
        evaluate.isWeak( flop1,hand1,strength,boardEvaluate );
        evaluate.isMedium( flop1,hand1,strength,boardEvaluate );
        evaluate.isStrong(flop1,hand1,strength,boardEvaluate  );



        //Strength countTP = new Strength();
        //countTP.countTP(flop1,card4,card5);
        //Strength midpair= new Strength();
        //midpair.isMidPair(flop1,hand1);

        //hand1.isSuit(card4,card5);
        //Strength countOver = new Strength();
        //countOver.countOver(flop1, hand1);
        //Strength lol = new Strength();
        //lol.countFD(flop1,hand1);

        Strength strengthOpp = new Strength();
        Evaluate evaluateOpp = new Evaluate();

        for(Hand hand : opponentHand){
            strengthOpp.countFD( flop1,hand);
            strengthOpp.countTP( flop1,hand );
            strengthOpp.countOver( flop1,hand );
            strengthOpp.isMidPair( flop1,hand );
            strengthOpp.countOE(flop1,hand );
            strengthOpp.countBP( flop1,hand );
            //evaluateOpp.isWeak( flop1,hand,strengthOpp,boardEvaluate );
            //evaluateOpp.isMedium( flop1,hand,strengthOpp,boardEvaluate );
            evaluateOpp.isStrong( flop1,hand,strengthOpp,boardEvaluate );
        }
        //System.out.println(strength.getTopPair());*/

    }
}

