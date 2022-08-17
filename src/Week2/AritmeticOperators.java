package Week2;

public class AritmeticOperators {
    public static void main(String[] args) {
        // int x = 10 % 3; = 1 as remainder
        //int x = 10 % 2; = 0 because no remainder
       // int x = 7/ 2; 3 as output because we using integer datatype, strikes out decimal point
        //float x = 7/2; float supports floating value, int value 7 and 2
      //  float x = 7.0F/2; //3.5
      //  float x =  (float) 7/2; //3.5, both float
       // double x = 7.0/ 2; // depends on value
       // int x = 2+3-4*5%8/4; //left to right associativity. precedence.
        // 2 +3-20 % 8/4;
        // 2 + 4 - 4 /4
        //2 +3 -1
        // 4
        int x =2+ (3 -4) * 5 % 8 / 4; //1
        System.out.println(x);
        // precedence importance --> [* / % ] > [ + - ]
       //Associativity --> left to right
    }
}
