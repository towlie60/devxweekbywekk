package Week6;

import java.util.Scanner;

public class JumpStatement {
    //break and continue, also known as jumpstatement
    //continue do not stop the continuation of the loop, it only stops the current iteration.
    public static void main(String[] args) {
      /*  for(int i=1;i<=10;i++)
        {
            System.out.println("value of i is "+i);
            if(i==5)//checks condition and break
               // break;
                continue;
           // System.out.println("value of i is "+i);
        }
        System.out.println("End of loop...");
    }*/
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter First no.");
            int i = sc.nextInt();
            System.out.println("Enter Second no.");
            int j = sc.nextInt();
            if (j == 0)
                break;
            System.out.println("Division:" + (i / j));
        } while (true);
        int n = 1;
        switch (n) {

            case 0:
                System.out.println("I'm Zero");
                break;
            case 1:
                System.out.println("I'm ONE");
                break;
            default:
                System.out.println("No Number Name");

                //System.out.println("End of loop...");
        }
    }
}
