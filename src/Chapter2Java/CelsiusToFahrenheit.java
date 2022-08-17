package Chapter2Java;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        //convert Farenheit to celsius
        double Fahrenheit = celsius * 9.0/5.0 + 32.0;
        System.out.println("Celsius " + celsius + " is " + Fahrenheit + " in Fahrenheit");
    }
}
