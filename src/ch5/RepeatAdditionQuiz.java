package ch5;

import java.util.Random;
import java.util.Scanner;

public class RepeatAdditionQuiz {

    public static void main (String [] args) {
            // TODO Auto-generated method stub
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Difficulty Level for Addition (0-2): ");
            final int DIFFICULTY = input.nextInt();  // difficulty level setting.

            // Problem Range settings.
            int RANGE = 0;      // for the total number range
            int BASELINE = 0;   // baseline for the numbers

            if (DIFFICULTY == 0) {
                RANGE = 10;
                BASELINE = 0;
            } else if (DIFFICULTY == 1) {
                RANGE = 100;
                BASELINE = 0;
            } else if (DIFFICULTY == 2) {
                RANGE = 199;
                BASELINE = -RANGE / 2;
            }

            // getting random problems
            long seed = System.currentTimeMillis();
            Random rinput = new Random(seed);
            int number1 = rinput.nextInt(RANGE) + BASELINE;
            int number2 = rinput.nextInt(RANGE) + BASELINE;

            // ask for answer from user
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            // print out result or error message.
            while(number1 + number2 != answer) {
                System.out.println("Wrong answer. Try again.");
                System.out.print("What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            }

            System.out.println("You got it!"); // Preset Exit (similar to preset else)
        }

    }
