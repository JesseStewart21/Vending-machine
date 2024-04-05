package com.techelevator;

import java.util.Scanner;

public class PurchaseScreen {


    private static final String OPTION_FEED_MONEY = "Feed Money";
    private static final String OPTION_SELECT_PRODUCT = "Select Product";
    private static final String OPTION_FINISH_TRANSACTION = "Finish Transaction";

    private static final String[] OPTIONS = {OPTION_FEED_MONEY, OPTION_SELECT_PRODUCT, OPTION_FINISH_TRANSACTION};

    private final Scanner userInput = new Scanner(System.in);

    private double currentMoneyProvided;

    //Getter
    public double getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    double newBalance;


    public void onChosenScreen(VendingMachine vendingMachine) {

        while (true) {

            String selectedOption = MenuDisplay.prompt(OPTIONS);
            if (selectedOption.equals(OPTION_FEED_MONEY)) {
                onFeedMoney(vendingMachine);
                System.out.println();
                System.out.println( "You current balance is $" +(currentMoneyProvided));
                System.out.println();
                System.out.println();
                System.out.println();

            }else if (selectedOption.equals(OPTION_SELECT_PRODUCT)) {
                for (Items item : vendingMachine.getInventory()) {
                    System.out.println(item.getLocation() + " | " + item.getProductName() + " | " + item.getPrice() + " | " + item.getType() + " | " + item.getQuanity());
                    System.out.println();

                }
                    System.out.println("Please enter item location");
                    System.out.println();
                    String selection=userInput.nextLine();

                    //for (int i = 0; i <inventory.    ; i++) {
                    
                }

                

                }


            }








    private void onFeedMoney(VendingMachine vendingMachine) {
        currentMoneyProvided += 1.00;
        System.out.println("You have deposited $1.00 to your current balance");
        vendingMachine.setCurrentMoneyProvided(vendingMachine.getCurrentMoneyProvided());

    }
}
