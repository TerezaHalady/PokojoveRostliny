package com.engeto.Lekce5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        File f = new File("kvetiny.txt");    // otevře soubor
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Soubor nelze otevřít");
            e.printStackTrace();
        }
    }


}

