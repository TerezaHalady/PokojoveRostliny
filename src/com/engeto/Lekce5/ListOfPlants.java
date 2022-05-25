package com.engeto.Lekce5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListOfPlants {
    private List<Plant> seznamRostlin = new ArrayList<>();   //import List

    public void addPlant(Plant plant) {      //metoda addPlant
        seznamRostlin.add(plant);
    }

    public void removePlant(Plant plant){
        seznamRostlin.remove(plant);
    }

    // chybí metoda na získání rostliny na zadaném indexu
    // public String getRostlinu (Plant plant) {}
    private Scanner x;

    public void openFile(){
        try {
            x = new Scanner(new File("kvetiny.txt"));
        }
        catch (Exception e){
            System.out.println("Soubor nelze otevřít");
        }
    }

}
