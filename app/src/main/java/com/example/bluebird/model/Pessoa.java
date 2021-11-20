package com.example.bluebird.model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private int id;
    private String name;
    private String fantasyName;
    private String gender;
    private String father;
    private String mother;
    private double income;

    public Pessoa(int id, String name, String fantasyName, String gender, String father, String mother, double income) {
        this.id = id;
        this.name = name;
        this.fantasyName = fantasyName;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.income = income;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public String getGender() {
        return gender;
    }

    public double getIncome() {
        return income;
    }
}
