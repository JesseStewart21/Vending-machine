package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayScreen {

    public void onChosenScreen(VendingMachine vendingMachine) {
        vendingMachine.getInventory();

        for (Items item : vendingMachine.getInventory()) {
            System.out.println(item.getLocation() +" | " +item.getProductName() +" | "+item.getPrice() +" | "+item.getType() +" | "+item.getQuanity());

        }
    }
}


