package Chapter2Java;

import java.util.Scanner;

public class GetChange1 {

    public static void main(String[] args) {

        // Create a Scanner

        Scanner input = new Scanner(System.in);


        // Receive the amount
        System.out.println("Enter the cost the customer has to pay: ");
        double cost = input.nextDouble();

        System.out.println("Enter the amount the customer pays: ");
        double amtPaid = input.nextDouble();

        // Calculate the amount of change that the customer should receive;

        double change = amtPaid - cost;

        // Take two significant digits by shifting left 2 digits
        // (preparing for rounding-off the change to the 100th digit.)
        // put the result to remainingAmount;  This one I give you.
      int remainingAmount =(int) (change * 100);

        // Find the number of one dollars by shifting right two digits and take only whole number
       int numberofOneDollars = remainingAmount / 100;

        // update the remainingAmount to total cents the customer should receive
        remainingAmount %=100;

        // Find the number of quarters in the remaining amount
        int numberofQuarters = remainingAmount / 25;
        // update the remainingAmount to the cents that have not received by the customer.
       remainingAmount %=25;

        // Find the number of dimes in the remaining amount
       int numberofDimes = remainingAmount / 10;
        // update the remainingAmount to the cents that have not received by the customer.
      remainingAmount %=10;
        // Find the number of nickels in the remaining amount
       int numberofNickles = remainingAmount / 5;
        // update the remainingAmount to the cents that should be the pennies that customer should receive.
      remainingAmount %=5;
        // Find the number of pennies in the remaining amount.  This one I give you.
      int numberofPennies = remainingAmount;
        // Display results (Study this part by yourself)
        System.out.println("Your amount " + change + " consists of");
        System.out.println("Your amount " + numberofOneDollars + " dollars ");
        System.out.println("Your amount " + numberofQuarters + " quarters ");
        System.out.println("Your amount " + numberofDimes + " dimes ");
        System.out.println("Your amount " + numberofNickles + " nickles ");
        System.out.println("Your amount " + numberofPennies + " pennies ");
       // System.out.println("Your amount " + change + " consists of");


    }
}
