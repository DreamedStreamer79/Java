package Run.Test;


import java.time.LocalDate;



import java.util.Scanner;
/*
This code takes in a date input such as "08 05 2015" and returns the day of the week it is on for example "WEDNESDAY"
The input is formatted in the format MM,DD,YYYY

*/
public class DateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mm = in.nextInt();
        int dd = in.nextInt();
        int yy = in.nextInt();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek());





    }
}