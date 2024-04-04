package com.techelevator;
import com.techelevator.VendingMachine;
import com.techelevator.Items;

public class PurchaseScreen extends VendingMachine{
    private static final String OPTION_FEED = "Feed Money";
    private static final String OPTION_SELECT = "Select Product";
    private static final String OPTION_FINISH = "Finish Transaction";
    private static final String[] OPTIONS = {OPTION_FEED, OPTION_SELECT, OPTION_FINISH};

    private double currentMoneyProvided;
    public double getCurrentMoneyProvided(){
        return currentMoneyProvided;
    }

    public void onChosenScreen(VendingMachine vendingMachine) {

        while (true) {

            String selectedOption;

            selectedOption = MenuDisplay.prompt(OPTIONS);
            if (selectedOption.equals("Feed Money")) {
                getCurrentMoneyProvided();
            } else if (selectedOption.equals("Select Product")) {
                System.out.println(inventory);
            } else {
                

                break;
            }
        }









    }

}
