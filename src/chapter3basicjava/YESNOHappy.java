package chapter3basicjava;

public class YESNOHappy {

    public static void main(String[] args) {


        //ues constant
        final boolean YES = true;

        //no constant
        final boolean NO = false;

        //Happy Characters
        char ch0 = 'H';
        char ch1 = 'a';
        char ch2 = 'p';
        char ch3 = 'p';
        char ch4 = 'y';
        char ch5 = '!';

        //print the boolean value of yes and no
        System.out.println("Boolean Value of YES: " + YES + " Boolean Value of NO: " + NO);

        //if yes print ""+(ch0)+(ch1)
        if (YES) {
            System.out.println("Yes case: " + (ch0) + (ch1));
        }
        //if no print ""+ch2+ch3
        if (!NO) System.out.println("No case: " + ch2 + ch3);

        // if (YES && Character.isLetter(ch0)) print ""+ch0+ch1+ch2+ch3+ch4+ch5
        if (YES && Character.isLetter(ch0)) {
            System.out.println("Original Message: " + (ch0) + ch1 + ch2 + ch3 + (ch4) + ch5);
//
            // print "" + (ch0+1) + (ch1+1) + (ch2+1) + (ch3+1) + (ch4+1) + (ch5+1);
            System.out.println("After Increment: " + (++ch0) + (++ch1) + (++ch2) + (++ch3) + (++ch4) + (++ch5));
            //"Boolean Value of YEs: " + YES + " Boolean Value of NO: " + NO);

            //print "" + (ch0-1) + (ch1-1) + (ch2-1) + (ch3-1) + (ch4-1) + (ch5-1);
            System.out.println("After Decrement: " + (--ch0) + (--ch1) + (--ch2) + (--ch3) + (--ch4) + (--ch5));

            System.out.println();


        }
    }
}