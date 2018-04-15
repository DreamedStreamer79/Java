package Run.Test;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

        //Random rand = new Random();
        //Scanner scan = new Scanner(System.in);




    public static void main(String[] args) {
        new GuessMyNumber().guessit();

    }
    public void guessit() {
        System.out.println("\nWelcome to the Guess My Number Mini program\nType a number below and try to guess the number that " +
                "the computer chose\n(Numbers up to 100)");
        int guess;
        int num;
        int guesses = 0;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        num = rand.nextInt(100);
        do {
            guess = scan.nextInt();
            guesses++;

            if(guess > num) {
                System.out.println("Lower!");
            } else if (guess < num) {
                System.out.println("Higher!");
            }
            else {
                System.out.println("Perfect!!\nMy number was " + num + " and you guessed it in " + guesses + " guesses.");
            }
        }while(guess != num);
    }
}