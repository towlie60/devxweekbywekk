package chapter3basicjava;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter Math Score: ");
        int mathScore = Integer.parseInt(input.nextLine());
        System.out.println("Enter English Score: ");
        int engScore = Integer.parseInt(input.nextLine());
       // String as = input.nextLine();

        System.out.println("Enter Address: ");
        String address = input.nextLine();
        System.out.println("Enter Physics score: ");
        int phyScore = input.nextInt();
        System.out.println("Enter Chemistry Score: ");
        int chemScore = input.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Math: " + mathScore);
        System.out.println("Eng: " + engScore);
        System.out.println("Address:" +address);
        System.out.println("Phy" + phyScore);
        System.out.println("Chem: " + chemScore);
    }
}
