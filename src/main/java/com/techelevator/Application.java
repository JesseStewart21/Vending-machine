package com.techelevator;
import com.techelevator.MenuDisplay;
import com.techelevator.VendingMachine;
import com.techelevator.PurchaseScreen;
import com.techelevator.DisplayScreen;

public class Application {

	public static final String INTRO = "Welcome to the Vendo-Matic 800";
	public static final String OPTION_DISPLAY = "Display Vending Machine Items";
	public static final String OPTION_PURCHASE = "Purchase";
	public static final String OPTION_EXIT = "Exit";
	public static final String[] OPTIONS = {OPTION_DISPLAY, OPTION_PURCHASE, OPTION_EXIT};

	private DisplayScreen displayScreen = new DisplayScreen();

	private PurchaseScreen purchaseScreen = new PurchaseScreen();


	public static void main(String[] args) {
		Application application = new Application();
		application.beginApplication();
	}

	public void beginApplication() {
		VendingMachine vendingMachine = new VendingMachine();
		//different options upon starting the app
		while (true) {
			System.out.println();
			System.out.println(INTRO);
			System.out.println();
			String selectedOption = MenuDisplay.prompt(OPTIONS);
			if (selectedOption.equals(OPTION_DISPLAY)) {
				displayScreen.onChosenScreen(vendingMachine);
			} else if (selectedOption.equals(OPTION_PURCHASE)) {
				purchaseScreen.onChosenScreen(vendingMachine);
			} else {
				System.out.println("Thank you!");
				break;
			}
		}
	}
}


