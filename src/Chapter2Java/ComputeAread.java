package Chapter2Java;

public class ComputeAread {

    public static void main(String[] args) {

        double radius;
        double area;
        double perimeter;

        radius = 20;

        area= radius * radius * 3.13159;
        perimeter = 3.14159 * 2 * radius;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
        System.out.println("The perimeter for the circle of radius " + radius + " is " + perimeter);
    }
}

