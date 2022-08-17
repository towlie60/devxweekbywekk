package ch4;

import java.util.Random;

public class Darts {
    public static void main(String[] args) {
        //board setting

        long seed = System.currentTimeMillis();
        Random input = new Random(seed);


        double s = 80.0;
        double rs = 10.0;
        double rm = 20.0;
        double rb = 30.0;

        //darts throwing

        double x1= input.nextDouble()*80.0 - 40.0;
        double y1 = input.nextDouble()*80.0 - 40.0;
        double x2 = input.nextDouble()*80.0 - 40.0;
        double y2 = input.nextDouble()*80.0 - 40.0;
        double x3 = input.nextDouble()*80.0 - 40.0;
        double y3 = input.nextDouble()*80.0 - 40.0;

        double d1 = Math.sqrt(x1*x1+y1*y1);
        double d2 = Math.sqrt(x2*x2+y2*y2);
        double d3 = Math.sqrt(x3*x3+y3*y3);

        //scoring
        double score1, score2, score3;
        if (d1 <= rs) score1 = 3.0;
            else if (d1 > rs && d1 < rm) score1 = 2.0;
            else if (d1 > rm && d1 < rb) score1 = 1.0;
            else score1 = 0.0;

            if (d2 <= rs) score2 = 3.0;
            else if (d1 > rs && d2 < rm) score2 = 2.0;
            else if (d1 > rm && d2 < rb) score2 = 1.0;
            else score2 = 0.0;

            if(d3 <= rs) score3 = 3.0;
            else if (d3 > rs && d3 < rm) score3 = 2.0;
            else if (d3 > rm && d3 < rb) score3 = 1.0;
            else score3 = 0.0;

            double sumScore = score1 + score2 + score3;
            double avgScore = sumScore / 3.0;

            //print report
        System.out.println("                           Darts Throwing Game");
        System.out.println("===================================================================");
        System.out.println("=====================================================================");
        System.out.printf("%-12s ", "First  Throw- ");
        System.out.printf("(%6.2f, %6.2f):     Distance: %6.2f, Score: %6.0f%n", x1, y1, d1, score1);
        System.out.printf("%-12s ", "Second Throw- ");
        System.out.printf("(%6.2f, %6.2f):     Distance: %6.2f, Score: %6.0f%n", x2, y2, d2, score2);
        System.out.printf("%-12s ", "Third  Throw- ");
        System.out.printf("(%6.2f, %6.2f):     Distance: %6.2f, Score: %6.0f%n", x3, y3, d3, score3);
        System.out.printf("Sum: %6.2f, Average: %6.2f%n", sumScore, avgScore);

    }
}

