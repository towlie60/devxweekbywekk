package Week4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Wap to perform operation depending on operators (+,-,*,/)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.:"); //accepted input from user
        double i = sc.nextDouble(); //store in a variable
        System.out.println("Enter 2nd no.:");
        double j =sc.nextDouble();
        System.out.println("Enter operator(+,-,*,/):");
        String op=sc.next(); //compare operator variables
        double result; //create one more variable
        switch (op)
        {
            case "+":
                result=i+j;
                System.out.println("Addition of  "+i+" and "+j+" is "+result);
                break;
            case "-":
                result=i-j;
                System.out.println("Subtraction of  "+i+" and "+j+" is "+result);
                break;
            case "*":
                result=i*j;
                System.out.println("Multiplication of "+i+" and "+j+" is "+result);
                break;
            case "/":
                result=i/j;
                System.out.println("Division of  "+i+" and "+j+" is "+result);
                break;
            default:
                System.out.println("No such operators");
        }
    }
}
