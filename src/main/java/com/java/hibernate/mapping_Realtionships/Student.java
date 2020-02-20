package com.java.hibernate.mapping_Realtionships;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int rollnumber;
    private String name;
    private int marks;
//    @OneToOne
//    private Laptop laptop;
    @ManyToMany
    private List<Laptop> laptop=new ArrayList<>();

    public int getRollnumber(int i) {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public void setMarks(int marks) {
        this.marks = marks;

    }
}
