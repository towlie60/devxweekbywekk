package Chapter2Java;

import java.util.Scanner;

public class FarenheitToCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Farenheit: ");
        double Farenheit = input.nextDouble();

        //convert Farenheit to celsius
        double celsius = (5.0 /9) * (Farenheit - 32);
        System.out.println("Farenheit " + Farenheit + " is " + celsius + " in Celsius");
    }
}
