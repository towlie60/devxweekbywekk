package IntroToJava;

import java.util.Scanner;

public class OnePlusOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 3;
        int b =5;
        int c = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        System.out.println("Enter an integer: ");
        int e = input.nextInt();

        System.out.println("Enter an integer");
        int f = input.nextInt();

        int sumA = a+b;
       int sumB = c+d;
        int sumC = e+f;

        System.out.println("From Program: " + a + " plus " + b + " is " + sumA);
        System.out.println("From Command Line: " + c + " plus " + d + " is " + sumB);
        System.out.println("From Console: " + e + " plus " + f + " is " + sumC);
    }
}
