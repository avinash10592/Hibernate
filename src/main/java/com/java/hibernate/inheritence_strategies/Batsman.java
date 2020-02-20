package com.java.hibernate.inheritence_strategies;

public class Batsman extends TeamIndia {
    private String battinghand;
    private int bestscore;

    public String getBattinghand() {
        return battinghand;
    }

    public void setBattinghand(String battinghand) {
        this.battinghand = battinghand;
    }

    public int getBestscore() {
        return bestscore;
    }

    public void setBestscore(int bestscore) {
        this.bestscore = bestscore;
    }

    public Batsman( String battinghand, int bestscore) {
        this.battinghand = battinghand;
        this.bestscore = bestscore;
    }
}
