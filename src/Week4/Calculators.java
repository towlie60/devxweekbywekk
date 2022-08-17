package Week4;

public class Calculators {
    public static void main(String[] args) {
//        System.out.println(Calculator.calculateTax(true, 10000000));
        Calculators c = new Calculators();
        double d = c.calculateTax(true, 100000);
        System.out.println(d);
    }
    public double calculateTax(boolean isMarried, double salary) {
        double tax = 0;

        if (isMarried) {
            tax = salary*5/100;
        }
        else {
            tax = salary*30/100;
        }

        return tax;
    }
    public void printTax(boolean isMarried, double salary) {
        System.out.println(calculateTax(isMarried, salary));
    }
}
