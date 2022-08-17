package Week2;

public class IncrementandDecrement {
    public static void main(String[] args) {

        int age =10;
//
        System.out.println(age++); //age = 10
       //age = 11
        System.out.println(++age); //age = 12
        //age = 12
//
       System.out.println(age++ + ++age); //12 + 14 = 26 //++age(13) + 1

        System.out.println(age--); //age = 10
        //age = 9
        System.out.println(--age); //age = 8
        //age = 8

        System.out.println(age-- + --age); //8 + 6 = 14
    }
}

    //increment operator
//    postfix: first operation and then increment
//    prefix: first increment and then perform operation

// postfix
//    int age = 10;
//    new age = age++ ==> newAge is 10

    //newAge = age;
    //age = age + 1;

    // prefix
//    int age = 10;
//    new age = ++age ==> newAge is 11
 //ex from above: age = age + 1;
 //newAge = age;


    //decrement operator
//    postfix: first operation and then decrement
//    prefix: first decrementand and then perform operation

    //postfix
//   int age = 10;
//   newAge = age--;
//   ==> newAge is 10;

   //newAge = age;
   // age = age - 1;

//prefix
//int age =10;
//newAge = --age;
//=> newAge is 9;

//age = age - 1;
//newAge = age;
