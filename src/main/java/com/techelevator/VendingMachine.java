package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VendingMachine {

    private double balance;


    String filename = "vendingmachine.csv";
    File file = new File(filename);


    List<Items> inventory = new ArrayList<>();

    public VendingMachine() {

        try (Scanner fileInput = new Scanner(file)) {

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] lineParts = line.split("\\|");

                if(lineParts.length == 4){
                    String location = lineParts[0];
                    String productName= lineParts[1];
                    double price= Double.parseDouble(lineParts[2]);
                    String type= lineParts [3];




                    Items newItems = new Items(location, productName, price, type);
                    inventory.add (newItems);

                }
            }




        }catch (FileNotFoundException ex) {
            System.out.println("Something went wrong");
        }


    }
}
