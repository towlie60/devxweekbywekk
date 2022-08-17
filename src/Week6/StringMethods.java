package Week6;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        /*
        length()
        trim()
        equals()
        eqaualsIgnoreCase()
        chartAt()
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s1=sc.nextLine(); //string literal
        //length calculates char in a given string
        System.out.println(s1.length());
        String s2 = "Sunita Rai"; //8 to 6 //2 to 20
        System.out.println(s2.length());
        //length method
        //trim()-removes leading or trailing
        String s3 ="       cscorner      ";
        System.out.println(s3); //hello 5 to 10  cscorner
        System.out.println(s3.length());
        System.out.println(s3.trim());//hello 5 to 10  cscorner and cscorner again
        String s4=s3.trim();
        System.out.println(s4.length());//s3.trim().length()

    }
}
