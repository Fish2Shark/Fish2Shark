package com.example.java;

public class Evaluate {

    private int weak;
    private int medium;
    private int strong;

    public int getWeak() {
        return weak;
    }

    public int getMedium() {
        return medium;
    }

    public int getStrong() {
        return strong;
    }

    public int isWeak(Flop flop, Hand hand, Strength strength, BoardEvaluate boardEvaluate){
        if(strength.getMidPair() > 0 && boardEvaluate.isConnected(flop))
            weak++;
        if(strength.getAir() > 0)
            weak++;
        if(strength.getBottomPair() > 0)
            weak++;

        return weak;
    }

    public int isMedium(Flop flop,Hand hand, Strength strength, BoardEvaluate boardEvaluate){
        if(strength.getMidPair() > 0 && boardEvaluate.isDry( flop ))
            medium++;
        if(strength.getFD() > 0)
            medium++;
        if(strength.getOE() > 0)
            medium++;

        return medium;
    }

    public int isStrong(Flop flop, Hand hand, Strength strength,BoardEvaluate boardEvaluate){
        if(strength.getTopPair() > 0)
            strong++;
        if(strength.getOverPair() > 0)
            strong++;
        if(strength.getBrelan() > 0)
            strong++;
        if(strength.getTwoPairs()  > 0)
            strong++;
        if(strength.getFull() > 0)
            strong++;
        if(strength.getFD() > 0 && strength.getOvers() > 0)
            strong++;
        if(strength.getOE() > 0 && strength.getOvers() > 0)
            strong++;
        if(strength.getFD() > 0 && strength.getOE() > 0)
            strong++;

        return strong;
    }



}
