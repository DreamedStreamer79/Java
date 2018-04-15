package Run.Test;

import java.util.Scanner;



public class HeightPredictor {

    public double getHeight() {
    Scanner s = new Scanner(System.in);
    System.out.println("How tall will you be when you grow up?\n\nWarning:This method has not been Medically proven and answers are not accurate");
    System.out.println("\nEnter the child's gender\nType in G (for Girl) or B (for Boy) ");
    String kidGender = s.next();
    System.out.println("Enter Mother's Height(CM)");
    int momHeight = s.nextInt();
    System.out.println("Enter Dad's Height(CM)");
    int dadHeight = s.nextInt();
    double result = 0;
    switch (kidGender) {

        case "G": result = momHeight + dadHeight;
            result=result/2;
            result= result -6.5;
            System.out.println(Math.floor(result));

            break;
        case "B": result = momHeight + dadHeight;
            result = result/2;
            result = result + 6.5;
            System.out.println("You, sir will measure around "+ Math.ceil(result));
            System.out.println("Tip: This measurement has been rounded up or down");
            break;
        default:
            System.out.println("Enter a valid input");
            break;



    }
        return Math.ceil(result);
}
    public static void main(String[] args) {
        new HeightPredictor().getHeight();


        }

    }

