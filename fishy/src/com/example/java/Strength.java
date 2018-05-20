package com.example.java;

public class Strength {

    private int topPair;
    private int midPair;
    private int overPair;
    private int air;
    private int brelan;



    private int twoPairs;
    private int full;
    private int bottomPair;

    public int getTopPair() {
        return topPair;
    }

    public int getMidPair() {
        return midPair;
    }

    public int getOverPair() {
        return overPair;
    }

    public int getOvers() {
        return overs;
    }

    public int getFD() {
        return FD;
    }

    public int getOE() {
        return OE;
    }

    public int getAir() {
        return air;
    }

    public int getBrelan() {
        return brelan;
    }

    public int getTwoPairs() {
        return twoPairs;
    }

    public int getFull() {
        return full;
    }

    public int getBottomPair() {
        return bottomPair;
    }

    private int overs;
    private int FD;
    private int OE;

    Strength(){}

    //COMPARAISON TP OK TEST
    public void countTP(Flop flop, Hand hand){
        if(hand.card1.value == 1)
            hand.card1.value = 14;
        if(hand.card2.value == 1)
            hand.card2.value = 14;

        if(flop.card1.value == 1)
            flop.card1.value = 14;
        if(flop.card2.value == 1)
            flop.card2.value = 14;
        if(flop.card3.value == 1)
            flop.card3.value = 14;

        if(hand.card1.compareValueTo(flop.card1)==0 && flop.card1.value > flop.card2.value && flop.card1.value > flop.card3.value) {
            this.topPair++;
        }
        if(hand.card1.compareValueTo(flop.card2)==0 && flop.card2.value > flop.card1.value && flop.card2.value > flop.card3.value) {
            this.topPair++;
        }
        if(hand.card1.compareValueTo(flop.card3)==0 && flop.card3.value > flop.card1.value && flop.card3.value > flop.card2.value) {
            this.topPair++;
        }
        if(hand.card2.compareValueTo(flop.card1)==0 && flop.card1.value > flop.card2.value && flop.card1.value > flop.card3.value) {
            this.topPair++;
        }
        if(hand.card2.compareValueTo(flop.card2)==0 && flop.card2.value > flop.card1.value && flop.card2.value > flop.card3.value) {
            this.topPair++;
        }
        if(hand.card2.compareValueTo(flop.card3)==0 && flop.card3.value > flop.card1.value && flop.card3.value > flop.card2.value) {
            this.topPair++;
        }

        if(hand.card1.value == 14)
            hand.card1.value = 1;
        if(hand.card2.value == 14)
            hand.card2.value = 1;

        if(flop.card1.value == 14)
            flop.card1.value = 1;
        if(flop.card2.value == 14)
            flop.card2.value = 1;
        if(flop.card3.value == 14)
            flop.card3.value = 1;
    }

    //OK (je pense)
    public void countOver(Flop flop, Hand hand){
        if((hand.card1.compareValueTo(flop.card1)==1 && hand.card1.compareValueTo(flop.card2)==1
                && hand.card1.compareValueTo(flop.card3)==1) &&
                ((hand.card2.compareValueTo(flop.card1)==1 && hand.card2.compareValueTo(flop.card2)==1
                        && hand.card2.compareValueTo(flop.card3)==1))){
            this.overs++;
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


    //ok
    public void countFD(Flop flop, Hand hand) {
        if ((hand.card1.compareColorTO(flop.card1) == 0 && hand.card1.compareColorTO(flop.card2) == 0)
        && (hand.card1.compareColorTO( hand.card2 ) == 0))
            this.FD++;

        if((hand.card1.compareColorTO( flop.card1 ) == 0 && hand.card1.compareColorTO( flop.card3 ) == 0)
            && (hand.card1.compareColorTO( hand.card2 ) == 0))
            this.FD++;

        if((hand.card1.compareColorTO( flop.card2 ) == 0 && hand.card1.compareColorTO( flop.card3 ) == 0)
            && (hand.card1.compareColorTO( hand.card2 ) == 0))
            this.FD++;

        if(hand.card1.compareColorTO(hand.card2) != 0) {
            if(hand.card1.compareColorTO(flop.card1) == 0 && hand.card1.compareColorTO(flop.card2) == 0 && hand.card1.compareColorTO(flop.card3) == 0) {
                this.FD++;
            }if(hand.card2.compareColorTO(flop.card1) == 0 && hand.card2.compareColorTO(flop.card2) == 0 && hand.card2.compareColorTO(flop.card3) == 0) {
                this.FD++;
            }
        }


    }

    public boolean isPaired(Hand hand){
        if(hand.card1.compareValueTo(hand.card2)==0){
            return true;
        }
        else return false;
    }

    //OK
    public void isMidPair(Flop flop, Hand hand){
        if(hand.card1.compareValueTo(flop.card1) == 0 && flop.card1.value > flop.card2.value && flop.card1.value < flop.card3.value){
            this.midPair++;
        }
        // 97
        // 8 9 10
        if(hand.card1.compareValueTo(flop.card2) == 0 && flop.card1.value < flop.card2.value && flop.card3.value > flop.card2.value){
            this.midPair++;
        }
        //97
        //8 10 9
        if(hand.card1.compareValueTo(flop.card3) == 0 && flop.card1.value < flop.card3.value && flop.card2.value > flop.card3.value){
            this.midPair++;
        }

        if(hand.card2.compareValueTo(flop.card2) == 0 && flop.card1.value < flop.card2.value && flop.card3.value > flop.card2.value){
            this.midPair++;
        }
        if(hand.card2.compareValueTo(flop.card3) == 0 && flop.card1.value < flop.card3.value && flop.card2.value > flop.card3.value){
            this.midPair++;
        }
        if(hand.card2.compareValueTo(flop.card1) == 0 && flop.card1.value > flop.card2.value && flop.card1.value < flop.card3.value){
            this.midPair++;
        }

        if(isPaired(hand)== true){
            if(hand.card1.value > flop.card1.value && hand.card1.value < flop.card3.value){
                this.midPair++;
            }
            if(hand.card1.value > flop.card2.value && hand.card1.value < flop.card3.value){
                this.midPair++;
            }
            if(hand.card1.value < flop.card2.value && hand.card1.value > flop.card3.value){
                this.midPair++;
            }
        }
    }

    //SEmble ok
    public void countOE(Flop flop, Hand hand) {

        if (hand.card2.value == hand.card1.value + 1) { // 3 - 4 --- X - X - X
            if (flop.card1.value == hand.card2.value + 1) {
                if (flop.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == hand.card2.value + 1) {
                if (flop.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == hand.card2.value + 1) {
                if (flop.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (hand.card1.value == hand.card2.value + 1) { // 4 - 3 --- X - X - X
            if (flop.card1.value == hand.card1.value + 1) {
                if (flop.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == hand.card1.value + 1) {
                if (flop.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == hand.card1.value + 1) {
                if (flop.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card1.value == hand.card1.value + 1) { // 3 - X --- 4 - X - X
            if (hand.card2.value == flop.card1.value + 1) {
                if (flop.card2.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == flop.card1.value + 1) {
                if (hand.card2.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == flop.card1.value + 1) {
                if (hand.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (hand.card1.value == flop.card1.value + 1) { // 4 - X --- 3 - X - X
            if (hand.card2.value == hand.card1.value + 1) {
                if (flop.card2.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == hand.card1.value + 1) {
                if (hand.card2.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == hand.card1.value + 1) {
                if (hand.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card1.value == hand.card2.value + 1) { // X - 3 --- 4 - X - X
            if (hand.card1.value == flop.card1.value + 1) {
                if (flop.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == flop.card1.value + 1) {
                if (hand.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == flop.card1.value + 1) {
                if (hand.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (hand.card2.value == flop.card1.value + 1) { // X - 4 --- 3 - X - X
            if (hand.card1.value == hand.card2.value + 1) {
                if (flop.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == hand.card2.value + 1) {
                if (hand.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == hand.card2.value + 1) {
                if (hand.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card2.value == hand.card1.value) { // 3 - X --- X - 4 - X
            if (hand.card2.value == flop.card2.value + 1) {
                if (flop.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == flop.card2.value + 1) {
                if (hand.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == flop.card2.value + 1) {
                if (hand.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (hand.card1.value == flop.card2.value + 1) { // 4 - X --- X - 3 - X
            if (hand.card2.value == hand.card1.value + 1) {
                if (flop.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == hand.card1.value + 1) {
                if (hand.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == hand.card1.value + 1) {
                if (hand.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card2.value == hand.card2.value + 1) { // X - 3 --- X - 4 - X
            if (hand.card1.value == flop.card2.value + 1) {
                if (flop.card1.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == flop.card2.value + 1) {
                if (hand.card1.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == flop.card2.value + 1) {
                if (hand.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (hand.card2.value == flop.card2.value + 1) { // X - 4 --- X - 3 - X
            if (hand.card1.value == hand.card2.value + 1) {
                if (flop.card1.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == hand.card2.value + 1) {
                if (hand.card1.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == hand.card2.value + 1) {
                if (hand.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card2.value == flop.card1.value + 1) { // X - X --- 3 - 4 - X
            if (hand.card1.value == flop.card2.value + 1) {
                if (hand.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (hand.card2.value == flop.card2.value + 1) {
                if (hand.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == flop.card2.value + 1) {
                if (hand.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (hand.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card1.value == flop.card2.value + 1) { // X - X --- 4 - 3 - X
            if (hand.card1.value == flop.card1.value + 1) {
                if (hand.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (hand.card2.value == flop.card1.value + 1) {
                if (hand.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card3.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card3.value == flop.card1.value + 1) {
                if (hand.card1.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (hand.card2.value == flop.card3.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card3.value == hand.card1.value + 1) { // 3 - X --- X - X - 4
            if (hand.card2.value == flop.card3.value + 1) {
                if (flop.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == flop.card3.value + 1) {
                if (hand.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == flop.card3.value + 1) {
                if (hand.card2.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (hand.card1.value == flop.card3.value + 1) { // 4 - X --- X - X - 3
            if (hand.card2.value == hand.card1.value + 1) {
                if (flop.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == hand.card1.value + 1) {
                if (hand.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == hand.card1.value + 1) {
                if (hand.card2.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card3.value == hand.card2.value + 1) { // X - 3 --- X - X - 4
            if (hand.card1.value == flop.card3.value + 1) {
                if (flop.card1.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == flop.card3.value + 1) {
                if (hand.card1.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == flop.card3.value + 1) {
                if (hand.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (hand.card2.value == flop.card3.value + 1) { // X - 4 --- X - X - 3
            if (hand.card1.value == hand.card2.value + 1) {
                if (flop.card1.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == hand.card2.value + 1) {
                if (hand.card1.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == hand.card2.value + 1) {
                if (hand.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card3.value == flop.card1.value + 1) { // X - X --- 3 - X - 4
            if (hand.card1.value == flop.card3.value + 1) {
                if (hand.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (hand.card2.value == flop.card3.value + 1) {
                if (hand.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == flop.card3.value + 1) {
                if (hand.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (hand.card2.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card1.value == flop.card3.value + 1) { // X - X --- 4 - X - 3
            if (hand.card1.value == flop.card1.value + 1) {
                if (hand.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (hand.card2.value == flop.card1.value + 1) {
                if (hand.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card2.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card2.value == flop.card1.value + 1) {
                if (hand.card1.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (hand.card2.value == flop.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card3.value == flop.card2.value + 1) { // X - X --- X - 3 - 4
            if (hand.card1.value == flop.card3.value + 1) {
                if (hand.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (hand.card2.value == flop.card3.value + 1) {
                if (hand.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == flop.card3.value + 1) {
                if (hand.card1.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (hand.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }else if (flop.card2.value == flop.card3.value + 1) { // X - X --- X - 4 - 3
            if (hand.card1.value == flop.card2.value + 1) {
                if (hand.card2.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == hand.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (hand.card2.value == flop.card2.value + 1) {
                if (hand.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (flop.card1.value == hand.card2.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }else if (flop.card1.value == flop.card2.value + 1) {
                if (hand.card1.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }else if (hand.card2.value == flop.card1.value + 1) {
                    this.OE++;
                    System.out.print("OE : " + OE);
                }
            }
        }
    }

    public void countAir(Flop flop, Hand hand)
    {
        if(getMidPair() == 0 && getOE() == 0 && getFD() == 0 && getOverPair() == 0 && getOvers() == 0 && getTopPair() == 0) {
            air++;
        }
    }

    public void countBrelan(Flop flop, Hand hand){
        if(hand.card1.compareValueTo(hand.card2) == 0) {
            if(hand.card1.compareValueTo(flop.card1) == 0 && hand.card1.compareValueTo(flop.card2) != 0 && hand.card1.compareValueTo(flop.card3) != 0) {
                this.brelan++;
            }
            if(hand.card1.compareValueTo(flop.card1) != 0 && hand.card1.compareValueTo(flop.card2) == 0 && hand.card1.compareValueTo(flop.card3) != 0) {
                this.brelan++;
            }
            if(hand.card1.compareValueTo(flop.card1) != 0 && hand.card1.compareValueTo(flop.card2) != 0 && hand.card1.compareValueTo(flop.card3) == 0) {
                this.brelan++;
            }
        }
        if(hand.card1.compareValueTo(hand.card2) != 0) {
            if(hand.card1.compareValueTo(flop.card1) == 0) {
                if(hand.card1.compareValueTo(flop.card2) == 0 && hand.card1.compareValueTo(flop.card3) != 0) {
                    this.brelan++;
                }
                if(hand.card1.compareValueTo(flop.card2) != 0 && hand.card1.compareValueTo(flop.card3) == 0) {
                    this.brelan++;
                }
            }
            if(hand.card1.compareValueTo(flop.card2) == 0) {
                if(hand.card1.compareValueTo(flop.card3) == 0 && hand.card1.compareValueTo(flop.card1) != 0) {
                    this.brelan++;
                }
            }

            if(hand.card2.compareValueTo(flop.card1) == 0) {
                if(hand.card2.compareValueTo(flop.card2) == 0 && hand.card2.compareValueTo(flop.card3) != 0) {
                    this.brelan++;
                }
                if(hand.card2.compareValueTo(flop.card2) != 0 && hand.card2.compareValueTo(flop.card3) == 0) {
                    this.brelan++;
                }
            }
            if(hand.card2.compareValueTo(flop.card2) == 0) {
                if(hand.card2.compareValueTo(flop.card3) == 0 && hand.card2.compareValueTo(flop.card1) != 0) {
                    this.brelan++;
                }
            }
        }
    }

    public void coutTwoPairs(Flop flop, Hand hand) {
        if(hand.card1.compareValueTo(hand.card2) != 0) {
            if(hand.card1.compareValueTo(flop.card1) == 0 && hand.card1.compareValueTo(flop.card2) != 0 && hand.card1.compareValueTo(flop.card3) != 0) {
                if(hand.card2.compareValueTo(flop.card2) == 0 && hand.card2.compareValueTo(flop.card3) != 0) {
                    this.twoPairs++;
                }
                if(hand.card2.compareValueTo(flop.card3) == 0 && hand.card2.compareValueTo(flop.card2) != 0) {
                    this.twoPairs++;
                }
            }
            if(hand.card1.compareValueTo(flop.card2) == 0 && hand.card1.compareValueTo(flop.card1) != 0 && hand.card1.compareValueTo(flop.card3) != 0) {
                if(hand.card2.compareValueTo(flop.card1) == 0 && hand.card2.compareValueTo(flop.card3) != 0) {
                    this.twoPairs++;
                }
                if(hand.card2.compareValueTo(flop.card3) == 0 && hand.card2.compareValueTo(flop.card1) != 0) {
                    this.twoPairs++;
                }
            }
            if(hand.card1.compareValueTo(flop.card3) == 0 && hand.card1.compareValueTo(flop.card1) != 0 && hand.card1.compareValueTo(flop.card2) != 0) {
                if(hand.card2.compareValueTo(flop.card1) == 0 && hand.card2.compareValueTo(flop.card2) != 0) {
                    this.twoPairs++;
                }
                if(hand.card2.compareValueTo(flop.card2) == 0 && hand.card2.compareValueTo(flop.card1) != 0) {
                    this.twoPairs++;
                }
            }
        }
    }

    public void countFull(Flop flop, Hand hand) {
        if(flop.card1.compareValueTo(flop.card2) == 0 && flop.card1.compareValueTo(flop.card3) != 0) {
            if(hand.card1.compareValueTo(flop.card1) == 0 && hand.card2.compareValueTo(flop.card3) == 0) {
                this.full++;
            }
            if(hand.card1.compareValueTo(flop.card3) == 0 && hand.card2.compareValueTo(flop.card1) == 0) {
                this.full++;
            }
            if(hand.card1.compareValueTo(flop.card3) == 0 && hand.card2.compareValueTo(flop.card3) == 0) {
                this.full++;
            }
        }
        if(flop.card1.compareValueTo(flop.card3) == 0 && flop.card1.compareValueTo(flop.card2) != 0) {
            if(hand.card1.compareValueTo(flop.card1) == 0 && hand.card2.compareValueTo(flop.card2) == 0) {
                this.full++;
            }
            if(hand.card1.compareValueTo(flop.card2) == 0 && hand.card2.compareValueTo(flop.card1) == 0) {
                this.full++;
            }
            if(hand.card1.compareValueTo(flop.card2) == 0 && hand.card2.compareValueTo(flop.card2) == 0) {
                this.full++;
            }
        }
        if(flop.card2.compareValueTo(flop.card3) == 0 && flop.card2.compareValueTo(flop.card1) != 0) {
            if(hand.card1.compareValueTo(flop.card1) == 0 && hand.card2.compareValueTo(flop.card2) == 0) {
                this.full++;
            }
            if(hand.card1.compareValueTo(flop.card2) == 0 && hand.card2.compareValueTo(flop.card1) == 0) {
                this.full++;
            }
            if(hand.card1.compareValueTo(flop.card1) == 0 && hand.card2.compareValueTo(flop.card1) == 0) {
                this.full++;
            }
        }
    }

    public void countBP(Flop flop, Hand hand) {
        if(hand.card1.compareValueTo(flop.card1) == 0 && flop.card1.value < flop.card2.value && flop.card1.value < flop.card3.value) {
            if(hand.card2.compareValueTo(hand.card1) != 0 && hand.card2.compareValueTo(flop.card2) != 0 && hand.card2.compareValueTo(flop.card3) != 0) {
                this.bottomPair++;
            }
        }
        if(hand.card1.compareValueTo(flop.card2) == 0 && flop.card2.value < flop.card1.value && flop.card2.value < flop.card3.value) {
            if(hand.card2.compareValueTo(hand.card1) != 0 && hand.card2.compareValueTo(flop.card1) != 0 && hand.card2.compareValueTo(flop.card3) != 0) {
                this.bottomPair++;
            }
        }
        if(hand.card1.compareValueTo(flop.card3) == 0 && flop.card3.value < flop.card1.value && flop.card3.value < flop.card2.value) {
            if(hand.card2.compareValueTo(hand.card1) != 0 && hand.card2.compareValueTo(flop.card1) != 0 && hand.card2.compareValueTo(flop.card2) != 0) {
                this.bottomPair++;
            }
        }
        if(hand.card2.compareValueTo(flop.card1) == 0 && flop.card1.value < flop.card2.value && flop.card1.value < flop.card3.value) {
            if(hand.card1.compareValueTo(hand.card2) != 0 && hand.card1.compareValueTo(flop.card2) != 0 && hand.card1.compareValueTo(flop.card3) != 0) {
                this.bottomPair++;
            }
        }
        if(hand.card2.compareValueTo(flop.card2) == 0 && flop.card2.value < flop.card1.value && flop.card2.value < flop.card3.value) {
            if(hand.card1.compareValueTo(hand.card2) != 0 && hand.card1.compareValueTo(flop.card1) != 0 && hand.card2.compareValueTo(flop.card3) != 0) {
                this.bottomPair++;
            }
        }
        if(hand.card2.compareValueTo(flop.card3) == 0 && flop.card3.value < flop.card1.value && flop.card3.value < flop.card2.value) {
            if(hand.card1.compareValueTo(hand.card2) != 0 && hand.card1.compareValueTo(flop.card1) != 0 && hand.card1.compareValueTo(flop.card2) != 0) {
                this.bottomPair++;
            }
        }
    }

}
