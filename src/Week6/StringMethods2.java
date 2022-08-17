package Week6;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        /*replace()
        concat(OO)
        toUpperCase()
        toLowerCase()
        substring()
         */
        //replaces a char or a string by another char or string
        String s1="cscorner";
        String s2=s1.replace('c','b');
        System.out.println(s2);
        System.out.println(s1.replace("cs","sunita"));

        //concat appends two strings
        String s3 =s1.concat(" Sunita Rai");
        System.out.println(s3);
        String s4="Java";
        System.out.println(s3+s4);

        //toUpperCase and tolowercase
        String s5= new String("Mumbai University, Computer Science");
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        String s6 = s5.substring(7); //inclusive
        System.out.println(s6);

        //substring methods, part of a string
      //  String s5= new String("Mumbai University, Computer Science");
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        //String s6 = s5.substring(7); //inclusive
        System.out.println(s6);
        System.out.println(s5.substring(19,30));



    }
}
