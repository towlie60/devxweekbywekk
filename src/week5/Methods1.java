package week5;

public class Methods1 {
    public static void main(String[] args) {
        System.out.println("Adding two numbers together: " + (2 + 10));
        System.out.println("Adding two numbers together:" + (534 + 34));
        System.out.println("Multiplication");
        System.out.println(multiply(10, 9));
        System.out.println(multiply(1, 9));


        // printSumOfTwoNumbers(2, 10);
        printSumOfTwoNumbers(2, 10);
        printSumOfTwoNumbers(534, 34);
        printHello();
        //double result = multiply(10, 9);
    }

    public static void printSumOfTwoNumbers(int num1, int num2) {
        //in method body we can put
        //as many statements as we need to
        System.out.println("Adding two numbers together: " + (num1 + num2));
    }

    public static void printHello() {
        System.out.println("Hello World");
    }

    public static double multiply(double num1, double num2) {
        double product = num1 * num2;
        return product;

    }
}

