package com.techelevator;
import com.techelevator.VendingMachine;
import com.techelevator.Items;

import java.util.Scanner;

public class PurchaseScreen extends VendingMachine{
    public static final String OPTION_FEED = "Feed Money";
    public static final String OPTION_SELECT = "Select Product";
   public static final String OPTION_FINISH = "Finish Transaction";
    public static final String[] OPTIONS = {OPTION_FEED, OPTION_SELECT, OPTION_FINISH};
    private final Scanner userInput = new Scanner(System.in);

    private double currentMoneyProvided;

    public void onChosenScreen(VendingMachine vendingMachine) {
        while (true) {

            String selectedOption;
            System.out.println();
            selectedOption = MenuDisplay.prompt(OPTIONS);
            System.out.println();
            if (selectedOption.equals(OPTION_FEED)) {
                onfeedMoney(vendingMachine);
                System.out.println();
                System.out.println("Your current balance is $" + currentMoneyProvided);
                TransactionLogger.logTransactions(0.0,currentMoneyProvided, "FEED MONEY");
            } else if (selectedOption.equals(OPTION_SELECT)) {
                for(Items item: vendingMachine.getInventory()){
                    System.out.println(item.getLocation() +" | "+item.getProductName() +" | "+item.getPrice() +" | "+item.getType() +" | "+item.getQuantity());
                    System.out.println();
                }
                System.out.println("Please enter your selection location");
                System.out.println();
                String selection = userInput.nextLine();

                /* search the list for selection location
                -After dispensing, print item name, cost, money balance and selection type message
                -If selection doesn't exist, say that and return
                -If selection is sold out say that and return
                 */
                System.out.println("You made an invalid selection, please try again");
                for(Items item: vendingMachine.getInventory()){
                    if(selection.equalsIgnoreCase(item.getLocation())){
                        if(item.getQuantity()>0 && currentMoneyProvided > item.getPrice()){
                        item.setQuantity(item.getQuantity()-1);
                        System.out.println();
                        double remaining = ((currentMoneyProvided - item.getPrice()) * 100) / 100;
                        System.out.println(item.getProductName() +" | "+"$"+item.getPrice() +" | "+"Your current balance is $"+String.format("%.2f",remaining));
                        currentMoneyProvided -= item.getPrice();
                        System.out.println();
                            if (item.getType().equalsIgnoreCase("Chip")){
                                System.out.println("Crunch Crunch, Yum!");
                            }if(item.getType().equalsIgnoreCase("Candy")){
                                System.out.println("Munch Munch, Yum!");
                            } if(item.getType().equalsIgnoreCase("Drink")){
                                System.out.println("Glug Glug, Yum!");
                            } if (item.getType().equalsIgnoreCase("Gum")){
                                System.out.println("Chew Chew, Yum!");
                            }
                        } else if(item.getQuantity()<= 0){
                            System.out.println();
                            System.out.println("Your selection is currently sold out, sorry!");
                        }
                    }
                }

            } else if(selectedOption.equals(OPTION_FINISH)){
                //split change into coins
                double change = currentMoneyProvided;
                double quarter;
                double dime;
                double nickel;
                double penny;

                if (change > 0.00){
                    quarter = Math.floor(change/.25);
                    change = change % .25;
                    dime = Math.floor(change/.10);
                    change = change % .10;
                    nickel = Math.floor(change/.05);
                    change = change % .05;
                    penny = Math.floor(change);
                    currentMoneyProvided = change;
                    System.out.println("Your change is " + quarter + " quarters," + " " + dime + " " + "dimes," + " " + nickel + " " + "nickels," + " "+ penny + " " + "pennies");
                }
                System.out.println();
                System.out.println("Your current balance is $"+String.format("%.2f",currentMoneyProvided));
                break;
            }else {

                break;
            }
        }
    }
    //deposit money function
    private void onfeedMoney(VendingMachine vendingMachine) {
        currentMoneyProvided += 1.00;
        System.out.println("You have deposited $1.00 to you current balance");
        vendingMachine.setCurrentMoneyProvided(vendingMachine.getCurrentMoneyProvided());
    }

}
