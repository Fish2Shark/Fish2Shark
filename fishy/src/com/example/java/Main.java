package com.example.java;

public class Main {

    public static void main(String[] args) {
        //9c As 2d
        Card card1 = new Card(13,"d");
        Card card2 = new Card(11,"h");
        Card card3 = new Card(7,"h");

        Flop flop1 = new Flop(card1,card2,card3);
        BoardEvaluate boardEvaluate = new BoardEvaluate();
        boardEvaluate.isRainbow( flop1 );
        boardEvaluate.isPairedBoard( flop1 );
        boardEvaluate.isDry( flop1 );


        Card card4 = new Card(9,"h");
        Card card5 = new Card(9,"h");
        Hand hand1 = new Hand(card4,card5);

        //Strength countTP = new Strength();
        //countTP.countTP(flop1,card4,card5);
        //Strength midpair= new Strength();
        //midpair.isMidPair(flop1,hand1);

        //hand1.isSuit(card4,card5);
        //Strength countOver = new Strength();
        //countOver.countOver(flop1, hand1);
        //Strength lol = new Strength();
        //lol.countFD(flop1,hand1);
    }
}
