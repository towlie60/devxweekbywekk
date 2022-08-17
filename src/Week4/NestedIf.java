package Week4;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

        int age = 77;

        if(age < 50) {
            System.out.println(" You are young");
        } else {
            System.out.println("You are old");
            if (age > 75) {
                System.out.println("You are really old!");
            }else {
                System.out.println("dont you worry you arent really old" +
                        "");
            }
        }
    }
}

