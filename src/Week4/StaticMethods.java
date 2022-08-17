package Week4;

public class StaticMethods {
    public static void main(String[] args) {
        Calculators c = new Calculators();
        //static methods are called from the className;
        int ab = StaticMethods.absolute(-12);

        //to instance methods are only called from object variables.
        double tax = c.calculateTax(true, 120000);
        System.out.println(tax);
    }

    private static int absolute(int i) {
        return (i < 0) ? -i : i;
    }
}
