package Week7;

public class NestedFor {

    public static void main(String[] args) {
        //if one loop exists inside another loop
        for(int i=1;i<=5;i++) //outer loop
        { //5*3=15

            for (int j = 1; j <= i; j++)//inner loop
               // System.out.println(j);
            System.out.println(j+ " $ ");
            System.out.println();
            //number of lines is going to decide outer loop
        }
    }
}
