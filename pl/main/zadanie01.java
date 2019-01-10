package pl.main;

import java.util.Scanner;

public class zadanie01 {
    public static void main(String[] args) {
        int value = 0;
        int exc1;
        double valueFar;
        do {
            exc1 = 0;
            System.out.print("Please set temperature in C degrees: ");
            Scanner input = new Scanner(System.in);
            String text = input.nextLine();
            try {
                value = Integer.valueOf(text);
            } catch (NumberFormatException e) {
                System.out.println("The value is not an integer");
                exc1 = 1;
                System.out.println(exc1);
            }
        } while (exc1 == 1);
        valueFar = ((double) value) * 1.8 + 32;
        System.out.println("The temperature " + value + " C degrees equals " + valueFar + " Farenheit degrees");

    }
}
