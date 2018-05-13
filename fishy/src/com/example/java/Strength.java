package com.example.java;

public class Strength {

    private int topPair;
    private int midPair;
    private int overPair;
    private int overs;
    private int FD;

    Strength(){}

    //COMPARAISON TP
    public void countTP(Flop flop, Card c1, Card c2){
        if(c1.compareValueTo(flop.card1)==0 && flop.card1.value > flop.card2.value && flop.card1.value > flop.card3.value) {
            this.topPair++;
        }
        if(c1.compareValueTo(flop.card2)==0 && flop.card2.value > flop.card1.value && flop.card2.value > flop.card3.value) {
            this.topPair++;
        }
        if(c1.compareValueTo(flop.card3)==0 && flop.card3.value > flop.card1.value && flop.card3.value > flop.card2.value) {
            this.topPair++;
        }
        if(c2.compareValueTo(flop.card1)==0 && flop.card1.value > flop.card2.value && flop.card1.value > flop.card3.value) {
            this.topPair++;
        }
        if(c2.compareValueTo(flop.card2)==0 && flop.card2.value > flop.card1.value && flop.card2.value > flop.card3.value) {
            this.topPair++;
        }
        if(c2.compareValueTo(flop.card3)==0 && flop.card3.value > flop.card1.value && flop.card3.value > flop.card2.value) {
            this.topPair++;
        }
    }

    public void countOver(Flop flop, Hand hand){
        if((hand.card1.compareValueTo(flop.card1)==1 && hand.card1.compareValueTo(flop.card2)==1
                && hand.card1.compareValueTo(flop.card3)==1) &&
                (hand.card2.compareValueTo(flop.card1)==1 && hand.card2.compareValueTo(flop.card2)==1
                        && hand.card2.compareValueTo(flop.card3)==1)){
            this.overs++;
            System.out.println(overs);
        }
    }

    public void countOverPair(Flop flop, Hand hand){
        if(isPaired( hand )==true){
            if(hand.card1.value > flop.card1.value &&
            hand.card1.value > flop.card2.value
                    && hand.card1.value >flop.card3.value){
                this.overPair++;
            }
        }
    }

    public void countFD(Flop flop, Hand hand) {
        if ((hand.card1.compareColorTO(flop.card1) == 0 && hand.card1.compareColorTO(flop.card2) == 0
                || hand.card1.compareColorTO(flop.card1) == 0 && hand.card1.compareColorTO(flop.card3) == 0
                || hand.card1.compareColorTO(flop.card2) == 0 && hand.card1.compareColorTO(flop.card3) == 0)
                && (hand.card1.compareColorTO(hand.card2) == 0) || (flop.card1.compareColorTO(flop.card2) == 0
                && (flop.card1.compareColorTO(flop.card3) == 0) && (hand.card1.compareColorTO(hand.card2) != 0))) {
            this.FD++;
            System.out.println(FD);
        }
    }

    public boolean isPaired(Hand hand){
        if(hand.card1.compareValueTo(hand.card2)==0){
            return true;
        }
        else return false;
    }


    public void isMidPair(Flop flop, Hand hand){
        if(hand.card1.compareValueTo(flop.card1) == 0 && flop.card1.value > flop.card2.value && flop.card1.value < flop.card3.value){
            this.midPair++;
            System.out.println(midPair);
        }
        // 97
        // 8 9 10
        if(hand.card1.compareValueTo(flop.card2) == 0 && flop.card1.value < flop.card2.value && flop.card3.value > flop.card2.value){
            this.midPair++;
            System.out.println(midPair);
        }
        //97
        //8 10 9
        if(hand.card1.compareValueTo(flop.card3) == 0 && flop.card1.value < flop.card3.value && flop.card2.value > flop.card3.value){
            this.midPair++;
            System.out.println(midPair);
        }

        if(hand.card2.compareValueTo(flop.card2) == 0 && flop.card1.value < flop.card2.value && flop.card3.value > flop.card2.value){
            this.midPair++;
            System.out.println(midPair);
        }
        if(hand.card2.compareValueTo(flop.card3) == 0 && flop.card1.value < flop.card3.value && flop.card2.value > flop.card3.value){
            this.midPair++;
            System.out.println(midPair);
        }
        if(hand.card2.compareValueTo(flop.card1) == 0 && flop.card1.value > flop.card2.value && flop.card1.value < flop.card3.value){
            this.midPair++;
            System.out.println(midPair);
        }

        if(isPaired(hand)== true){
            if(hand.card1.value > flop.card1.value && hand.card1.value < flop.card3.value){
                this.midPair++;
                System.out.println(midPair);
            }
            if(hand.card1.value > flop.card2.value && hand.card1.value < flop.card3.value){
                this.midPair++;
                System.out.println(midPair);
            }
            if(hand.card1.value < flop.card2.value && hand.card1.value > flop.card3.value){
                this.midPair++;
                System.out.println(midPair);
            }
        }
    }
}
