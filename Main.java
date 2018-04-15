package Run.Test;


import java.util.Calendar;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Gets the Current hour of day
        Calendar calendar = Calendar.getInstance();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);

        String salute ="Good Morning";

        if (hours >= 1 && hours <= 12) {
            salute ="Good Morning";


        } else if (hours >= 12 && hours <= 16) {
            salute ="Good Afternoon";


        } else if (hours >= 16 && hours <= 21) {
            salute ="Good Evening";


        } else if (hours >= 21 && hours <= 24) {
            salute ="Good night";

        }
        //using a salutation variable "salute" to avoid to copy the same message several times
        System.out.println("\n\n"+salute+" and Welcome to the main project \nThis is where I store all of the " +
                "mini-programs I have written in java\n\nThis greeting itself is a mini-program, try running this " +
                "program at a different hour of the day and see how the initial greeting changes\n\nAnyways, Below " +
                "is a list of all the mini projects, input the number of the program you would like to see run.");
        System.out.println("1:Calculator for Common Multiples of two numbers\n2:A project for pizza delivery\n3:A program that" +
                " predicts how tall you will be when you grow up\n4:Reverses whatever you put into it\n5:A Currency " +
                "Converter, it converts Dollars, Euros, Japanese Yen and British Pound\n6: A program that has you guess a random number that the " +
                "computer chose.");
        Scanner scanned = new Scanner(System.in);
        int scorner = scanned.nextInt();
        if (scorner == 1) new MultipleCalculator().multiple();
        else if (scorner == 2) new PizzaCalculator().getPizzaValue();
        else if (scorner == 3) new HeightPredictor().getHeight();
        else if (scorner == 4) new ReverseString_Java().firstReverse();
        else if (scorner == 5) new CurrencyConvertor().currency();
        else if (scorner == 6) new GuessMyNumber().guessit();
        else System.out.println(" Invalid input");
    }
}
