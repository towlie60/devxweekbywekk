package Week7;

public class Whileloop {  //loop are used to repeat a block of code
    public static void main(String[] args) {
        /*
        4 types
        1.while loop
        2.do while loop
        3.for loop
        4.for each
         */
        //print number 1 to 10
        int n=1;
        while (n<=10) //true
        {
            System.out.println(n);
            n++;//n=n+1

        }

        System.out.println("End of LOOP");
        System.out.println("Odd nos: from 1 to 10");
          int i=1;
          while (i<=10) {
              {
                  System.out.println(i);
                  i+=2;

              }

          }
        System.out.println("Even nos. from 10 to 1");
          //backward loops
        //print even numbers 10 to 1
        i=10;
          while(i>=1)
          {
              System.out.println(i);
              i-=2;
          }
    }
}
