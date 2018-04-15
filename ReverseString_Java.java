package Run.Test;

import java.util.*;


class ReverseString_Java {
    public String firstReverse() {
        System.out.println("\nWelcome to the Reverse a Word Program\n\nType a word in and see how it becomes reversed\n(You can input more than one word but no spaces between them.)");
        Scanner s = new Scanner(System.in);
        String ReversedString = s.next();
        String Result = new StringBuffer(ReversedString).reverse().toString();
        System.out.println(Result);
        return Result;
    }

    public static void main (String[] args){
        new ReverseString_Java().firstReverse();


        }

    }









  