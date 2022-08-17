package Week4;

import java.util.Scanner;

public class NestedIfPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age < 16)
            System.out.println("You are a Minor! Not eligible to work ");
     else {

            if (age > 16  && age <= 60)
            System.out.println("You are Eligible to work!");
            else
            System.out.println(" Happy retirement ....");
        }
    }
}

