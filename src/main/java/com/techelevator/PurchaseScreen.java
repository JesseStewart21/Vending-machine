package com.techelevator;
import com.techelevator.VendingMachine;
import com.techelevator.Items;

import java.util.Scanner;

public class PurchaseScreen extends VendingMachine{
    private static final String OPTION_FEED = "Feed Money";
    private static final String OPTION_SELECT = "Select Product";
    private static final String OPTION_FINISH = "Finish Transaction";
    private static final String[] OPTIONS = {OPTION_FEED, OPTION_SELECT, OPTION_FINISH};
    private final Scanner userInput = new Scanner(System.in);

    private double currentMoneyProvided;

    public void onChosenScreen(VendingMachine vendingMachine) {

        while (true) {

            String selectedOption;

            selectedOption = MenuDisplay.prompt(OPTIONS);
            if (selectedOption.equals(OPTION_FEED)) {
                onfeedMoney(vendingMachine);
                System.out.println();
                System.out.println("Your current balance is $"+(currentMoneyProvided));
                System.out.println();
            } else if (selectedOption.equals(OPTION_SELECT)) {
                for(Items item: vendingMachine.getInventory()){
                    System.out.println(item.getLocation() +" | "+item.getProductName() +" | "+item.getPrice() +" | "+item.getType() +" | "+item.getQuantity());
                    System.out.println();
                }
                System.out.println("Please enter your selection location");
                System.out.println();
                String selection = userInput.nextLine();

                for(Items item: vendingMachine.getInventory()){
                    if(selection.equals(item.getLocation())){
                        if(item.getQuantity()>0){
                            
                        }
                    }
                }

            } else {


                break;
            }
        }
    }

    private void onfeedMoney(VendingMachine vendingMachine) {
        currentMoneyProvided += 1.00;
        System.out.println("You have deposited $1.00 to you current balance");
        vendingMachine.setCurrentMoneyProvided(vendingMachine.getCurrentMoneyProvided());
    }

}
