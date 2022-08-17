package Week3;

import java.util.Scanner;

public class InputFromUser1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // get input from user with Scanner, get input from system.in

        System.out.println("Enter fat sibling:"); //get input from user and store in a variable called pokemon 1
        String pokemon1 = scan.nextLine();


        System.out.println("Enter fat sibling:"); //get input from user and store in a variable called pokemon 1
        String pokemon2= scan.nextLine();


        System.out.println("Enter fat sibling:"); //get input from user and store in a variable called pokemon 1
        String pokemon3 = scan.nextLine();


        System.out.println("Enter fat sibling:"); //get input from user and store in a variable called pokemon 1
        String pokemon4 = scan.nextLine();

        System.out.println("Here is your obese family");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);

    }

}
