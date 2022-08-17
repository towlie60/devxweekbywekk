package ch4;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Enter Your Weight: ");
        double weight = input.nextDouble();
        System.out.println("Enter Your Height: ");
        double height = input.nextDouble();

        double bmi = weight/height/height;

        String category = "";
        if(bmi < 16.0) {
            category = "Severe Thinness";
        }
        else if (bmi >= 16.0 && bmi < 17) {
            category = "Moderate Thinness";
        }
        else if (bmi >=17.0 && bmi < 18.5){
            category = "Mild Thinness";
        }
        else if (bmi >= 18.5 && bmi < 25){
            category = "Normal";
        }
        else if (bmi >= 25.0 && bmi < 30) {
            category = "Overweight";
        }
        else if (bmi >= 30.0 && bmi < 35) {
            category = "Obese Class 1";
        }
        else if (bmi >=35.0 && bmi <= 40) {
            category = "Obese Class 2";
        }
        else {
            category = "Obese Class 3";
        }

        System.out.println("       Body Mass Index (BMI) Report ");
        System.out.println("            " + name);
        System.out.println("==================================================");
        System.out.printf("    Weight: %6.2f", weight);
        System.out.printf("    Height: %6.2f%n",  height);
        System.out.printf("     BMI:   %6.2f" , bmi);
        System.out.printf("     Catergory: %-20s%n", category);
    }
}
