package com.engeto.Lekce5;

import java.util.ArrayList;
import java.util.List;

public class ListOfPlants {
    private List<Plant> seznamRostlin = new ArrayList<>();   //import List

    public void addPlant(Plant plant) {      //metoda addPlant
        seznamRostlin.add(plant);
    }

    public void removePlant(Plant plant){
        seznamRostlin.remove(plant);
    }

    // chybí metoda na získání rostliny na zadaném indexu
}
