package ch4;

import java.util.Scanner;

public class StudentGPAWithLetterGrade {
    public static void main(String[] args){

        // Define the Scanner input stream
        Scanner input = new Scanner(System.in);

        // Ask user to enter name, social security number (SSN), date of birth (DOB),
        // address,
        // math, eng, phy, chem, pe, ushistory score in number grade 0 to 5 in integer grade.
        // Notice: make sure full name can be entered and there is no feed-through problem.
        System.out.print("Enter Student's Name (First, Last): ");
        String name = input.nextLine();

        // Calculate the GPA for the student
        System.out.print("Enter Student's SSN (XXX-XX-XXXX): ");
        String ssn = input.nextLine();
        System.out.print("Enter Student's Date of Birth (MM/DD/YYYY): ");
        String dob = input.nextLine();
        System.out.print("Enter Student's Address: ");
        String address = input.nextLine();
        System.out.print("Enter Math Score (0-99): ");
        int math = input.nextInt();
        System.out.print("Enter English Score (0-99): ");
        int english = input.nextInt();
        System.out.print("Enter Physics Score (0-99): ");
        int physics = input.nextInt();
        System.out.print("Enter Chemistry Score (0-99): ");
        int chem = input.nextInt();
        System.out.print("Enter P.E. Score (0-99): ");
        int pe = input.nextInt();
        System.out.print("Enter U.S. History Score (0-99): ");
        int us = input.nextInt();

        int mathScore = 0;
        int englishScore = 0;
        int physicsScore = 0;
        int chemScore = 0;
        int peScore = 0;
        int usScore = 0;

        char mathGrade = ' ';
        char englishGrade = ' ';
        char physicsGrade = ' ';
        char chemGrade = ' ';
        char peGrade = ' ';
        char usGrade = ' ';

        if (math>=90){mathScore=4; mathGrade = 'A';}
        else if (math>=80)  {mathScore=3; mathGrade = 'B';}
        else if (math>=70)  {mathScore=2; mathGrade = 'C';}
        else if (math>=60)  {mathScore=1; mathGrade = 'D';}
        else {mathScore=0; mathGrade = 'F';}

        if (english>=90){englishScore=4; englishGrade = 'A';}
        else if (english>=80)  {englishScore=3; englishGrade = 'B';}
        else if (english>=70)  {englishScore=2; englishGrade = 'C';}
        else if (english>=60)  {englishScore=1; englishGrade = 'D';}
        else {englishScore=0; englishGrade = 'F';}

        if (physics>=90){physicsScore=4; physicsGrade = 'A';}
        else if (physics>=80)  {physicsScore=3; physicsGrade = 'B';}
        else if (physics>=70)  {physicsScore=2; physicsGrade = 'C';}
        else if (physics>=60)  {physicsScore=1; physicsGrade = 'D';}
        else {physicsScore=0; physicsGrade = 'F';}

        if (chem>=90){chemScore=4; chemGrade = 'A';}
        else if (chem>=80)  {chemScore=3; chemGrade = 'B';}
        else if (chem>=70)  {chemScore=2; chemGrade = 'C';}
        else if (chem>=60)  {chemScore=1; chemGrade = 'D';}
        else {chemScore=0; chemGrade = 'F';}

        if (pe>=90){peScore=4; peGrade = 'A';}
        else if (pe>=80)  {peScore=3; peGrade = 'B';}
        else if (pe>=70)  {peScore=2; peGrade = 'C';}
        else if (pe>=60)  {peScore=1; peGrade = 'D';}
        else {peScore=0; peGrade = 'F';}

        if (us>=90){usScore=4; usGrade = 'A';}
        else if (us>=80)  {usScore=3; usGrade = 'B';}
        else if (us>=70)  {usScore=2; usGrade = 'C';}
        else if (us>=60)  {usScore=1; usGrade = 'D';}
        else {usScore=0; usGrade = 'F';}

        double gpa = (mathScore + englishScore + physicsScore + chemScore + peScore + usScore) /6.0;

        // print out student semeter report
        // 1. print a school score report head
        System.out.println("                     Washington High School        ");
        System.out.println("                   Semester Score Report Card ");

        // 2. print the student name,
        //    SSN in (XXX-XX-1234 format, only show the last 4 digits for security purpose),
        //    DOB,
        //    address
        System.out.printf("Name: %-30s ", name);
        System.out.printf("SSN: XXX-XX-%-4s  ", ssn.substring(7));
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

        System.out.printf("%-18s", "Math Grade: ");
        System.out.printf("%-2c ", mathGrade);
        System.out.printf("%-18s", "English Grade: ");
        System.out.printf("%-2c ", englishGrade);
        System.out.printf("%-18s", "Physics Grade: ");
        System.out.printf("%-2c %n", physicsGrade);

        System.out.printf("%-18s", "Chem. Score: ");
        System.out.printf("%-2d ", chem);
        System.out.printf("%-18s", "P.E. Score: ");
        System.out.printf("%-2d ", pe);
        System.out.printf("%-18s", "U.S.Hist. Score: ");
        System.out.printf("%-2d %n", us);

        System.out.printf("%-18s", "Chem. Grade: ");
        System.out.printf("%-2c ", chemGrade);
        System.out.printf("%-18s", "P.E. Grade: ");
        System.out.printf("%-2c ", peGrade);
        System.out.printf("%-18s", "U.S.Hist. Grade: ");
        System.out.printf("%-2c %n", usGrade);
        // 4. print out the GPA
        System.out.printf("Student's GPA: %-8.2f", gpa);
    }
}
