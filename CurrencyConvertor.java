package Run.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class CurrencyConvertor {


    public static void main(String[] args) {
        new CurrencyConvertor().currency();


    }
    public double currency() {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("\n-----------------------------------\nWelcome to the currency converter\n\nWhat currency would you like to start with?");
        ArrayList<String>currencies;
        currencies = new ArrayList<>();
        currencies.add("1: US Dollar $");
        currencies.add("2: Euro €");
        currencies.add("3: Japanese Yen ¥");
        currencies.add("4: The Great British Pound £");
        for (String currency : currencies) System.out.println(currency);
        int start = sc.nextInt();
        System.out.println("\nPerfect!, now what do you want to turn it into?");
        for (String currency : currencies) System.out.println(currency);
        int end = sc.nextInt();
        System.out.println("And, last but not least, how many would you like to convert?");
        int quantity = sc.nextInt();
        String startCurrency = " ";
        String endCurrency = "";
        double result = 0;
        if (start == 1 && end == 1) {
            System.out.println("Why are you trying to convert Dollars to Dollars, just WHY...");
            startCurrency = "US Dollars $";
            endCurrency = "US Dollars $";
        }
        else if (start == 1 && end == 2) {
            startCurrency = "US Dollars $";
            endCurrency = "Euros €";
            result = 0.81*quantity;

        }
        else if (start == 1 && end == 3) {
            startCurrency = "US Dollars $";
            endCurrency = "Japanese Yens ¥";
            result = 106.7*quantity;

        }
        else if (start == 1 && end == 4) {
            startCurrency = "US Dollars $";
            endCurrency = "The Great British Pounds £";
            result = 0.71*quantity;

        }
        else if (start == 2 && end == 1) {
            startCurrency = "Euros €";
            endCurrency = "US Dollars $";
            result = 1.2*quantity;

        }
        else if (start == 2 && end == 2) {
            startCurrency = "Euros €";
            endCurrency = "Euros €";
            System.out.println("Why are you trying to convert Euros to Euros, just WHY...");

        }

        else if (start == 2 && end == 3) {
            startCurrency = "Euros €";
            endCurrency = "Japanese Yens ¥";
            result = 131*quantity;

        }
        else if (start == 2 && end == 4) {
            startCurrency = "Euros €";
            endCurrency = "The Great British Pounds £";
            result = 0.87*quantity;

        }
        else if (start == 3 && end == 1) {
            startCurrency = "Japanese Yens ¥";
            endCurrency = "US Dollars $";
            result = 0.00936*quantity;

        }
        else if (start == 3 && end == 2) {
            startCurrency = "Japanese Yens ¥";
            endCurrency = "Euros €";
            result = 0.00762*quantity;

        }
        else if (start == 3 && end == 3) {
            startCurrency = "Japanese Yens ¥";
            endCurrency = "Japanese Yens ¥";
            System.out.println("Why are you trying to convert Yen to Yen, just WHY...");

        }
        else if (start == 3 && end == 4) {
            startCurrency = "Japanese Yens ¥";
            endCurrency = "The Great British Pounds £";
            result = 0.00665*quantity;

        }
        else if (start == 4 && end == 1) {
            startCurrency = "The Great British Pounds £";
            endCurrency = "US Dollars $";
            result = 1.4*quantity;

        }
        else if (start == 4 && end == 2) {
            startCurrency = "The Great British Pounds £";
            endCurrency = "Euros €";
            result = 1.14*quantity;

        }
        else if (start == 4 && end == 3) {
            startCurrency = "The Great British Pounds £";
            endCurrency = "Japanese Yens ¥";
            result = 150.35*quantity;


        }
        else if (start == 4 && end == 4) {
            startCurrency = "The Great British Pounds £";
            endCurrency = "The Great British Pounds £";
            System.out.println("Why are you trying to convert pounds to pounds, just WHY...");


        }
        System.out.println("\nYou converted: " + quantity + " "+ startCurrency + " to " + endCurrency);
        System.out.println("The total of the conversion was " + result +  " " +endCurrency);
        return(result);

    }


}
