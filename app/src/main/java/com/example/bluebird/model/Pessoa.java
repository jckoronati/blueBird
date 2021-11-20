package com.example.bluebird.model;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private int id;
    private String nome;
    private String nomeSocial;
    private String genero;
    private String pai;
    private String mae;
    private double renda;

    public Pessoa(int id, String nome, String nomeSocial, String genero, String pai, String mae, double renda) {
        this.id = id;
        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.genero = genero;
        this.pai = pai;
        this.mae = mae;
        this.renda = renda;
    }

    //Implementar Getters e Setters
    public int getId() {
        return id;
    }
}
