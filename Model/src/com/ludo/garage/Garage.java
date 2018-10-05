package com.ludo.garage;

import java.util.List;

public class Garage {
    private List<Vehicle> voitures;

    public void addVoiture(Vehicle voit){
        System.out.println(voit.toString());
    }
}
