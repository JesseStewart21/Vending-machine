package com.techelevator;

import java.util.Scanner;

public class MenuDisplay {
    //Menu startup and display modeled after cya game
    private static Scanner input = new Scanner(System.in);
    public static String prompt(String[] options) {

        int selectedOption = 1;

        while(true) {
            try {
                printOptions(options);

                selectedOption = Integer.parseInt(input.nextLine());

                selectedOption--;

                if(selectedOption >= 0 && selectedOption < options.length) {
                    break;
                }
            } catch (Exception ex) {

            }
            System.out.println("Invalid option");
        }
        return options[selectedOption];
    }
    public static void printOptions(String[] options) {
        System.out.println("Please select an option:");
        for(int i = 0; i < options.length; i++) {
            int optionNum = i + 1;
            System.out.println( "(" + optionNum + ") " + options[i] );
        }
    }

}
