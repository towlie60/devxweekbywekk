package Chapter2Java;

import java.util.Scanner;

public class FarenheitToCelsius2 {

    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));

        System.out.println("Enter a degree in Farenheit: ");
        double Farenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (Farenheit - 32);

        System.out.println(" Frenheir " + Farenheit + " is " + celsius + " in Celsius");
    }
    }

