package com.ludo.garage;

public class Moteur {
    protected TypeMoteur type;
    private String cylindre;
    private Double prix;


    public Moteur(String cylindre, Double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }




    public Double getPrix() {
        return prix;
    }




}
