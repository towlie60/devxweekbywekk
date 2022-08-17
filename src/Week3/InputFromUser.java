package Week3;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // get input from user with Scanner, get input from system.in

        System.out.println("Enter pokemon 1:"); //get input from user and store in a variable called pokemon 1
        String pokemon1 = scan.nextLine();


        System.out.println("Enter pokemon 2:"); //get input from user and store in a variable called pokemon 1
        String pokemon2= scan.nextLine();


        System.out.println("Enter pokemon 3:"); //get input from user and store in a variable called pokemon 1
        String pokemon3 = scan.nextLine();


        System.out.println("Enter pokemon 4:"); //get input from user and store in a variable called pokemon 1
        String pokemon4 = scan.nextLine();

        System.out.println("Here are your pokemon!");
        System.out.println(pokemon1);
        System.out.println(pokemon2);
        System.out.println(pokemon3);
        System.out.println(pokemon4);

    }

}
