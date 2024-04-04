package com.techelevator;
import com.techelevator.VendingMachine;
import com.techelevator.MenuDisplay;
import com.techelevator.PurchaseScreen;
import com.techelevator.DisplayScreen;


public class Application {

	private static final String INTRO = "Welcome to the Vendo-Matic 800!";


	private static final String OPTION_DISPLAY = "Display vending machine items";
	private static final String OPTION_PURCHASE= "Purchase";
	private static final String OPTION_EXIT = "Exit";

	private static final String [] OPTIONS = {OPTION_DISPLAY,OPTION_DISPLAY,OPTION_EXIT};


	private DisplayScreen displayScreen = new DisplayScreen();
	private PurchaseScreen purchaseScreen = new PurchaseScreen();


	public static void main(String[] args) {
		Application application = new Application();
		application.beginApplication();
	}

	public void beginApplication(){
		VendingMachine vendingMachine = new VendingMachine();

		while (true) {
			System.out.println(INTRO);

			String selectedOption = MenuDisplay.prompt(OPTIONS);
			if (selectedOption.equals(displayScreen)) {
				displayScreen.onChosenScreen (vendingMachine);
			} else if (selectedOption.equals(purchaseScreen)) {
				purchaseScreen.onChosenScreen (vendingMachine);
			} else {
				System.out.println("Thank you !");
				break;
			}

		}



	}








}
