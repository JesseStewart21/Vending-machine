package com.techelevator;
import com.techelevator.Items;
import com.techelevator.VendingMachine;

import java.util.Scanner;

public class DisplayScreen {

    public void onChosenScreen(VendingMachine vendingMachine) {
    vendingMachine.getInventory();
    for(Items item: vendingMachine.getInventory()){
        System.out.println(item.getLocation() +" | "+item.getProductName() +" | "+item.getPrice() +" | "+item.getType() +" | "+item.getQuantity());
    }




    }



}
