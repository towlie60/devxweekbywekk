package Chapter2Java;

import java.util.Scanner;

public class ComputeAreaWithConsoleInputAndConstant2 {

    public static void main(String[] args) {

        final double PI = 3.14159;

        double radius;
        double area;
        double perimeter;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        radius = input.nextDouble();

        area = radius * radius * PI;
        perimeter = PI * 2 * radius;
        System.out.println(" The area of the circle of raidus " + radius + " is " + area);
        System.out.println(" The perimeter for the circle of raids " + radius + " is " + perimeter);
    }
}
