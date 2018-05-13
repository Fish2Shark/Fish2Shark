package com.example.java;

public class BoardEvaluate {

    private static int dryBoard;
    private static int semiCoordinatedBoard;
    private static int coordinatedBoard;
    private int treeSuits;
    private int twoSuits;

    public boolean isRainbow(Flop flop) {
        if (flop.card1.compareColorTO( flop.card2 ) != 0
                && flop.card2.compareColorTO( flop.card3 ) != 0) {
            return true;
        } else return false;
    }

    //6 6 9
    public boolean isPairedBoard(Flop flop) {
        if (flop.card1.compareValueTo( flop.card2 ) == 0) {
            System.out.println("dry");
            return true;
        } else if (flop.card1.compareValueTo( flop.card3 ) == 0) {
            System.out.println("dry");
            return true;
        } else if (flop.card2.compareValueTo( flop.card3 ) == 0) {
            System.out.println("dry");
            return true;
        } else return false;

    }

    public boolean TreeGap(Flop flop) {
        if (Math.abs( flop.card1.value - flop.card2.value ) >= 3) {
            return true;
        } else if (Math.abs( flop.card1.value - flop.card3.value ) >= 3) {
            return true;
        } else if (Math.abs( flop.card2.value - flop.card3.value ) >= 3) {
            return true;
        } else return false;
    }

    public boolean TwoGap(Flop flop) {
        if (Math.abs( flop.card1.value - flop.card2.value ) >= 2) {
            return true;
        } else if (Math.abs( flop.card1.value - flop.card3.value ) >= 2) {
            return true;
        } else if (Math.abs( flop.card2.value - flop.card3.value ) >= 2) {
            return true;
        } else return false;
    }

    public boolean AbetweenT(Flop flop){
        if (flop.card1.value >= 10 && flop.card2.value < 10 && flop.card3.value < 10) {
            return true;
        } else if (flop.card2.value >= 10 && flop.card1.value < 10 && flop.card3.value < 10) {
            return true;
        } else if (flop.card3.value >= 10 && flop.card1.value < 10 && flop.card2.value < 10) {
            return true;
        } else return false;
    }
    public int FlushDraw(Flop flop){
        if(flop.card1.compareColorTO( flop.card2 ) == 0 && flop.card2.compareColorTO( flop.card3 )==0){
            return treeSuits++;
        }
        else if(flop.card1.compareColorTO( flop.card2 ) == 0 && flop.card1.compareColorTO( flop.card3 )!=0 ){
            return twoSuits++;
        }
    }

    public boolean isDry(Flop flop) {
        if(twoSuits==1 && TwoGap( flop )==true){
            return true;
        }
        //if(AbetweenT(flop)==true && )
        if (isRainbow( flop ) == true) {
            System.out.println("dry");
            return true;
        } else if (TreeGap( flop ) == true) {
            System.out.println("dry");
            return true;
        } else if (isPairedBoard( flop ) == true) {
            System.out.println("dry");
            return true;
        } else return false;

    }
}
