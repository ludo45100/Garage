package com.ludo.garage;

import java.util.List;

public class Vehicle {
    private Double prix;
    protected String nom;
    private List<Option> options;
    protected Marque nomMarque;
    protected Moteur moteur;

    public Double getPrix() {
        return prix;
    }

    public List<Option> getOptions() {
        return options;
    }

    public Marque getNomMarque() {
        return nomMarque;
    }
    public void addOption(Option opt){
        prix+=opt.getPrix();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "prix=" + prix +
                ", nom='" + nom + '\'' +
                ", options=" + options +
                ", nomMarque=" + nomMarque +
                '}';
    }


}
