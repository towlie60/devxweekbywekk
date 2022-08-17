package ch4;

import java.util.Scanner;

public class SimpleIfDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        if (num % 5 == 0) {
            System.out.println("Multiple of Five.");
        }
        if (num % 2 == 0) {
            System.out.println("Multiple of Two. ");
        }
        if (num % 5 == 0 || num % 2 == 0) {
            System.out.println("Multiple of Five or Two. ");
        }
        if (num % 5 == 0 && num % 2 == 0) {
            System.out.println("Multiple of Both Five and Two."); }
        if (num % 5 == 0 ^ num % 2 == 0 ) {
            System.out.println("Multiple of Either Five or Two. "); }

    }
}
