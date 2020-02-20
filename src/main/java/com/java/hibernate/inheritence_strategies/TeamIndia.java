package com.java.hibernate.inheritence_strategies;

public class TeamIndia {
    private int slno;
    private String firstname;
    private String lastname;

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public TeamIndia(){

    }

    public TeamIndia(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
