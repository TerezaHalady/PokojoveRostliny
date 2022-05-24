package com.engeto.Lekce5;

public class PlantExceptions extends Exception {

    public PlantExceptions(String message) {             //konstruktor, abych mohla do vyjímky vypsat text
    super(message);                   // chybová hláška předána výše do Exception, ve formě String
    }

}
