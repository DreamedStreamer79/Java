package Run.Test;

import java.util.Scanner;

public class Words_to_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nWelcome to the Words to Minutes converter!\nEnter the speed that you will speak at and the number " +
                "of words and I will tell you how long it will take you to say it.");
        double result;

        System.out.println("\nWhat speed will you be talking at\n1:Fast(160 words per minute\n2: Average (130 words per minute\n3: Slow(100 words per minute)");
        int speed = scanner.nextInt();
        System.out.println("Number of words?");
        int words = scanner.nextInt();
        switch(speed) {
            case (1) : result = (words / 160);
                System.out.println(result + " Minutes");
            break;
            case(2) : result = (words/130);
                System.out.println(result + " Minutes");
            break;
            case(3) : result = (words/100);
                System.out.println(result + " Minutes");
                break;
        }

    }
}
