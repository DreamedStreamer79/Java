package Run.Test;

import java.util.Scanner;

public class MultipleCalculator {

    public static void main(String[] args) {
        MultipleCalculator cal = new MultipleCalculator();
        cal.multiple();
    }

    public void multiple(){
        System.out.println("Multiple Calculator\nType in two numbers, each on a different line");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int g = sc.nextInt();
        for (int i = 1; i < 101; i++) {

            int j = k*i;
            System.out.println(j);
            if (j%g == 0) {
                System.out.println("Here!");
            }

        }
    }


}

