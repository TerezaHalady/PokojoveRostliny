package com.engeto.Lekce5;

import java.time.LocalDate;

public class Plant {
    String name;
    String notes;
    LocalDate planted;
    LocalDate watering;
    int frequencyOfWatering;

    public Plant(String name, String notes, LocalDate planted, LocalDate watering, int frequencyOfWatering) throws PlantExceptions {
        if (getFrequencyOfWatering() <= 0) {                                        // zadání zálivky nesmí být menší nebo rovno 0
            throw new PlantExceptions("Zadané číslo musí být větší než 0");    //Musím vytvořit konstruktor pro zadání textu
        }

        if (watering.isAfter(LocalDate.now())) {
            throw new PlantExceptions("Zadané datum nesmí být starší než zasazení rostliny");
        }

        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public Plant(String notes, LocalDate watering) {
        this.notes = new String();    // prázdný textový řetězec
        this.watering = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) {
        this.watering = watering;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering(int frequencyOfWatering) {
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public Plant(String notes, LocalDate planted, LocalDate watering, int frequencyOfWatering) throws PlantExceptions {

        if (getFrequencyOfWatering() <= 0) {                                        // zadání zálivky nesmí být menší nebo rovno 0
            throw new PlantExceptions("Zadané číslo musí být větší než 0");    //Musím vytvořit konstruktor pro zadání textu
        }

        if (watering.isAfter(LocalDate.now())) {
            throw new PlantExceptions("Zadané datum nesmí být starší než zasazení rostliny");
        }
        this.notes = new String();
        this.planted = LocalDate.now();
        this.watering =LocalDate.now();
        this.frequencyOfWatering =7;
    }
       
       public String getWateringInfo() {
        return "Plant" +
                "name='" + name + '\'' +
                ", watering=" + watering +
                ", frequencyOfWatering=" + frequencyOfWatering +
                '}';
    }
}
    

