package chapter3basicjava;

import java.util.Scanner;

public class StudentGPA {

    public static void main(String[] args) {


        // Define the Scanner input stream
        Scanner input = new Scanner(System.in);

        // Ask user to enter name, social security number (SSN), date of birth (DOB),
        // address,
        // math, eng, phy, chem, pe, ushistory score in number grade 0 to 5 in integer grade.
        // Notice: make sure full name can be entered and there is no feed-through problem.

        System.out.println("Enter Student's Name (First, Last): ");
        String name = input.nextLine();

        // Calculate the GPA for the student

        System.out.println("Enter Student's SSN (XXX-XX-XXX): ");
        String ssn = input.nextLine();
        System.out.println("Enter Student's Date of Birth (MM/DD/YYYY): ");
        String dob = input.nextLine();
        System.out.println("Enter Student's Address: ");
        String address = input.nextLine();
        System.out.println("Enter Math Score (0-5): ");
        int math = input.nextInt();
        System.out.println("Enter English Score (0-5): ");
        int english = input.nextInt();
        System.out.println("Enter Physics Score (0-5): ");
        int physics = input.nextInt();
        System.out.println("Enter Chemistry Score (0-5):");
        int chem = input.nextInt();
        System.out.println("Enter P.E. Score (0-5): ");
        int pe = input.nextInt();
        System.out.println("Enter U.S. History Score (0-5): ");
        int us = input.nextInt();

        double gpa = (math + english + physics + chem + pe + us) / 6.0;

        // print out student semeter report
        // 1. print a school score report head

        System.out.println("     Santa Barbara High School ");
        System.out.println("    Semester Score Report Card ");

        // 2. print the student name,
        //    SSN in (XXX-XX-1234 format, only show the last 4 digits for security purpose),
        //    DOB,
        //    address

        System.out.printf("Name: %-30s ", name);
        System.out.printf("SSN: XXX-XX-%-4s ", ssn.substring(7));
        System.out.printf("DOB: %-10s%n", dob);
        System.out.printf("Address: %-80s%n", address);


        System.out.println("========================================================================");
        // 3. print the digital score subject by subject
        System.out.printf("%-18s", "Math Score: ");
        System.out.printf("%-2d ", math);
        System.out.printf("%-18s", "English Score: ");
        System.out.printf("%-2d ", english);
        System.out.printf("%-18s", "Physics Score: ");
        System.out.printf("%-2d %n", physics);
        System.out.printf("%-18s", "Chem. Score: ");
        System.out.printf("%-2d ", chem);
        System.out.printf("%-18s", "P.E. Score: ");
        System.out.printf("%-2d ", pe);
        System.out.printf("%-18s", "U.S.Hist. Score: ");
        System.out.printf("%-2d ", us);
        // 4. print out the GPA
        System.out.printf("Student's GPA: %-8.2f", gpa);
    }

}
