package com.java.hibernate.inheritence_strategies;

public class Bowler extends TeamIndia {
    private String bowlinghand;
    private String bestfigure;

    public String getBowlinghand() {
        return bowlinghand;
    }

    public void setBowlinghand(String bowlinghand) {
        this.bowlinghand = bowlinghand;
    }

    public String getBestfigure() {
        return bestfigure;
    }

    public void setBestfigure(String bestfigure) {
        this.bestfigure = bestfigure;
    }

    public Bowler( String bowlinghand, String bestfigure) {
        this.bowlinghand = bowlinghand;
        this.bestfigure = bestfigure;
    }
}
