package Run.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaCalculator {

    public double getPizzaValue() {
        Scanner s = new Scanner(System.in);
        ArrayList<String> CrustTypes = new ArrayList<>();
        ArrayList<String> Toppings = new ArrayList<>();
        ArrayList<String> Toppings2 = new ArrayList<>();
        ArrayList<String> pizzaSize = new ArrayList<>();
        CrustTypes.add("1: Thin Crust");
        CrustTypes.add("2: Cheesy Crust");
        CrustTypes.add("3: Deep Dish Crust(Chicago Style)");
        CrustTypes.add("4: Flat Bread");
        CrustTypes.add("5: Thick Crust");
        Toppings.add("1: Peperoni");
        Toppings.add("2: Mushrooms");
        Toppings.add("3: Onions");
        Toppings.add("4: Sausage");
        Toppings.add("5: Bacon");
        Toppings.add("6: Extra Cheese");
        Toppings.add("7: Black Olives");
        Toppings.add("8: Extra Peperoni");
        Toppings.add("9: Ham");
        Toppings.add("10: Basil");
        Toppings.add("11: Tomatoes");
        Toppings.add("12: Chicken");
        Toppings2.add("1: Peperoni");
        Toppings2.add("2: Mushrooms");
        Toppings2.add("3: Onions");
        Toppings2.add("4: Sausage");
        Toppings2.add("5: Bacon");
        Toppings2.add("6: Extra Cheese");
        Toppings2.add("7: Black Olives");
        Toppings2.add("8: Extra Peperoni");
        Toppings2.add("9: Ham");
        Toppings2.add("10: Basil");
        Toppings2.add("11: Tomatoes");
        Toppings2.add("12: Chicken");
        pizzaSize.add("1: Small");
        pizzaSize.add("2: Medium");
        pizzaSize.add("3: Large");

        String CrustFinal = null;
        String Topping1Final = null;
        String Topping2Final = null;
        String sizeFinal = null;
        int CrustPrice = 0;
        int Topping1Price = 0;
        int Topping2Price = 0;
        int SizePrice = 0;
        System.out.println("\n \nChoose your crust:");
        for (String CrustType : CrustTypes) {

            System.out.println(CrustType);
        }
        /*1 */
        int CrustDecide = s.nextInt();

        System.out.println("\n ");
        System.out.println("Choose your First topping:");
        for (String Topping : Toppings) {

            System.out.println(Topping);
        }
        /*2*/
        int ToppingDecide;
        ToppingDecide = s.nextInt();
        System.out.println("\n ");
        System.out.println("Choose your second Topping:");
        for (String Topping2 : Toppings2) {
            System.out.println(Topping2);
        }
        int ToppingDecide2 = s.nextInt();
        System.out.println("\n ");
        System.out.println("Choose your size:");
        for (String Size : pizzaSize) {
            System.out.println(Size);
        }
        int SizeDecide = s.nextInt();
        System.out.println("How many Pizzas?");
        int quantity = s.nextInt();

        switch (CrustDecide) {
            case 1:
                CrustFinal = "Thin Crust";
                CrustPrice = 1;
                break;
            case 2:
                CrustFinal = "Cheesy Crust";
                CrustPrice = 1;
                break;
            case 3:
                CrustFinal = "Deep Dish Crust";
                CrustPrice = 1;
                break;
            case 4:
                CrustFinal = "Flat Bread";
                CrustPrice = 1;
                break;
            case 5:
                CrustFinal = "Thick Crust";
                CrustPrice = 1;
                break;
        }

        switch (ToppingDecide) {
            case 1:
                Topping1Final = "Peperoni";
                Topping1Price = 1;
                break;
            case 2:
                Topping1Final = "Mushrooms";
                Topping1Price = 1;
                break;
            case 3:
                Topping1Final = "Onions";
                Topping1Price = 1;
                break;
            case 4:
                Topping1Final = "Sausage";
                Topping1Price = 1;
                break;
            case 5:
                Topping1Final = "Bacon";
                Topping1Price = 1;
                break;
            case 6:
                Topping1Final = "Extra Cheese";
                Topping1Price = 1;
                break;
            case 7:
                Topping1Final = "Black Olives";
                Topping1Price = 1;
                break;
            case 8:
                Topping1Final = "Extra Peperoni";
                Topping1Price = 2;
                break;
            case 9:
                Topping1Final = "Ham";
                Topping1Price = 1;
                break;
            case 10:
                Topping1Final = "Basil";
                Topping1Price = 1;
                break;
            case 11:
                Topping1Final = "Tomatoes";
                Topping1Price = 1;
                break;
            case 12:
                Topping1Final = "Chicken";
                Topping1Price = 1;
                break;
        }

        switch (ToppingDecide2) {
            case 1:
                Topping2Final = "Peperoni";
                Topping2Price = 1;
                break;
            case 2:
                Topping2Final = "Mushrooms";
                Topping2Price = 1;
                break;
            case 3:
                Topping2Final = "Onions";
                Topping2Price = 1;
                break;
            case 4:
                Topping2Final = "Sausage";
                Topping2Price = 1;
                break;
            case 5:
                Topping2Final = "Bacon";
                Topping2Price = 1;
                break;
            case 6:
                Topping2Final = "Extra Cheese";
                Topping2Price = 1;
                break;
            case 7:
                Topping2Final = "Black Olives";
                Topping2Price = 1;
                break;
            case 8:
                Topping2Final = "Extra Peperoni";
                Topping2Price = 1;
                break;
            case 9:
                Topping2Final = "Ham";
                Topping2Price = 1;
                break;
            case 10:
                Topping2Final = "Basil";
                Topping2Price = 1;
                break;
            case 11:
                Topping2Final = "Tomatoes";
                Topping2Price = 1;
                break;
            case 12:
                Topping2Final = "Chicken";
                Topping2Price = 1;
                break;
        }

        switch (SizeDecide) {
            case 1:
                sizeFinal = "Personal";
                SizePrice = 5;
                break;
            case 2:
                sizeFinal = "Medium";
                SizePrice = 7;
                break;
            case 3:
                sizeFinal = "Large";
                SizePrice = 9;
                break;


        }
        int subtotal = CrustPrice + Topping1Price + Topping2Price + SizePrice;
        subtotal = subtotal * quantity;
        System.out.println("\nOrder: " + quantity + " " + sizeFinal + " " + CrustFinal + " pizza, topped with " + Topping1Final + " and " + Topping2Final);
        System.out.println("Subtotal: $" + subtotal);
        return subtotal;
    }

    public static void main(String[] args) {
        new PizzaCalculator().getPizzaValue();


    }

}
