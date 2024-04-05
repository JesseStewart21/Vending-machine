package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private final double MIN_MONEY_PROVIDED = 0.00;

    private double currentMoneyProvided = MIN_MONEY_PROVIDED;
    public double getCurrentMoneyProvided(){
        return currentMoneyProvided;
    }

    public void setCurrentMoneyProvided(double currentMoneyProvided){
        this.currentMoneyProvided = currentMoneyProvided;
    }
    private String filename = "vendingmachine.csv";
    private File file = new File(filename);

    public List<Items> inventory = new ArrayList<>();

    public List<Items> getInventory(){
        return inventory;
    }




    public VendingMachine(){
        try (Scanner fileInput = new Scanner(file)){


            while (fileInput.hasNextLine()){
                String line = fileInput.nextLine();

                String[] lineParts = line.split("\\|");


                if(lineParts.length == 4) {
                    String location = lineParts[0];
                    String productName = lineParts[1];
                    double price = Double.parseDouble(lineParts[2]);
                    String type = lineParts[3];

                    Items newItem = new Items(location, productName, price, type);
                    inventory.add(newItem);

                }
            }

        } catch(FileNotFoundException ex){
            System.out.println("Something went wrong: " + ex.getMessage());
        }

    }


}
