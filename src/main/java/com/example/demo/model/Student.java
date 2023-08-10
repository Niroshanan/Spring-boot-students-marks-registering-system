package com.example.demo.model;
//CS/2018/030
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private int caMarks;
    @NonNull
    private int practicalMarks;
    @NonNull
    private int theoryMarks ;
    @NonNull
    private double finalMarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaMarks() {
        return caMarks;
    }

    public void setCaMarks(int caMarks) {
        this.caMarks = caMarks;
    }

    public int getPracticalMarks() {
        return practicalMarks;
    }

    public void setPracticalMarks(int practicalMarks) {
        this.practicalMarks = practicalMarks;
    }

    public int getTheoryMarks() {
        return theoryMarks;
    }

    public void setTheoryMarks(int theoryMarks) {
        this.theoryMarks = theoryMarks;
    }

    public double getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(double finalMarks) {
        this.finalMarks = finalMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", caMarks=" + caMarks +
                ", practicalMarks=" + practicalMarks +
                ", theoryMarks=" + theoryMarks +
                '}';
    }
}
