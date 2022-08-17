package Week7;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
   /*  int i=1;
     while(i<=10)
     {
         System.out.println("i is " +i);
         i++;
       }
     i=1;
     do{
         System.out.println("i value is " +i); //printed at least once
         i++; //execute statements at least once, it is  not checking condition
     }while (i>=10);*/

     //do while loop is executed for first time irrespective of the condition.
        //after executing while loop for the first time, then condition is checked

    Scanner sc = new Scanner(System.in);
    int option;
    int n1 = 19, n2 = 34;
    do

    {
        System.out.println("Enter\n1.Addition\n2.Subtraction\n3.Exit");
        option = sc.nextInt();
        if (option == 1)
            System.out.println("Addition is " + (n1 + n2));
        else if (option == 2)
            System.out.println("Subtraction is " + (n1 - n2));
        else
            System.out.println("No such option!!");

    }while(option!=3);
}


}
