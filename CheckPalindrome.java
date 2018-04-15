package Run.Test;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word and we will check if it is spelt the same backwards.");
        String word =scanner.next();
        String result = new StringBuffer(word).reverse().toString();
        if (result.equals(word)) {
            System.out.println("Yep!, the word "+word + " is the same spelt backwards");
        }
        else {
            System.out.println("Nope "+ word + " is not spelt the same backwards\nYour word spelt backwards is "+ result +".");
        }
    }
}
