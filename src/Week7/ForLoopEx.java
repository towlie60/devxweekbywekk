package Week7;

import java.util.Scanner;

public class ForLoopEx {
    public static void main(String[] args) {
//        int i=1;
//        while(i<=10)
//        {
//            System.out.println("i is " +i);
//            i++; //syntax: for(initilization;condition;increment/decrement)
//        }
//        //syntax: for(initilization;condition;increment/decrement)
//       // int j;
//        int j=5;
////        for(;j<=10;j++)
////            System.out.println("j is "+j);
////        System.out.println(j);
//        for(;;)
//            System.out.println(" j is "+j);
//        //System.out.println(j);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n= sc.nextInt();
        for(int i=0;i<=20;i+=2) //+=2 prints out even numbers
        {
            System.out.println(n + "*" + i + "=" + (n * i));
            //2*1=1
            //2*2=4
        }
    }
}
