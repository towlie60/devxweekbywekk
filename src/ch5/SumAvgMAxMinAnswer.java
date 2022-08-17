package ch5;

import java.util.Scanner;

public class SumAvgMAxMinAnswer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean done = false;
        String token = "";
        int num;
        int count = 0;
        double sum = 0.0;
        double average = 0.0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Program to find sum, average, maximum, and minimum starts ...");

        while (!done) {
            System.out.println("Enter an integer: ");
            token = input.nextLine();
            //accumulate sum
            num = Integer.parseInt(token);
            sum += num;
            //set new maximum
            //put your code here
            if (num > max) max = num;

            //set new minimum
            //put your code here
            if (num < min) min = num;

            count++;
            System.out.println("Do you want to quit (Y/N)? ");
            String answer = input.nextLine();
            if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y') {
                done = true;
            }
        }

        //calculate average
        //put your code here
        average = sum / count;

        System.out.println("Results for while loop ...");

        System.out.printf("Sum:  %15.3f %n", sum);

        System.out.printf("Average: %15.3f%n", average);

        System.out.printf("Maximum: %15d%n", max);

        System.out.printf("Miniumum %15d%n", min);

        done = false;
        token = "";
        num = 0;
        count = 0;
        sum = 0.0;
        average = 0.0;

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        System.out.println("\n\n\n");
        System.out.println("do while loop starts here ...");


        do {
            System.out.println("Enter an integer: ");
            token = input.nextLine();
            sum += num;
            if (num > max) max = num;

            if (num < min) min = num;

            count++;
            System.out.println("Do you want to quite (Y/N)?");
            String answer = input.nextLine();
            if (answer.charAt(0) == 'Y' || answer.charAt(0) ==
                    'y') {
                done = true;
            }
        } while (!done);

        average = sum / count;

        System.out.println("Results for do while loop ...");
        // print out sum:
        System.out.printf("Sum:     %15.3f %n", sum);
        // print out average:
        System.out.printf("Avarage: %15.3f%n", average);
        // print out maximum
        System.out.printf("Maximum: %15d%n", max);
        // print out minimum
        System.out.printf("Minimum: %15d%n", min);

        // program ends
    }
}
