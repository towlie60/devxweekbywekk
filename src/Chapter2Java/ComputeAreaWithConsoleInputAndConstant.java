package Chapter2Java;

//class that helps you read data from console
import java.util.Scanner;

public class ComputeAreaWithConsoleInputAndConstant {
    public static void main(String[] args) {

        //1st portion below
       final double PI = 3.14159;

        //2nd part below
        //final double PI = 5.0;
        double radius; //declare radius
        double area;   //declare area
        double perimeter;
        //define input string and the string handler, get data from system.in
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: "); //will stop here to get data
        // input string to get radius
        radius = input.nextDouble();
        //radius = 20;  //new value is radius

        area= radius * radius * PI;
        perimeter = PI * 2 * radius;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
        System.out.println("The perimeter for the circle of radius " + radius + " is " + perimeter);
    }
}

