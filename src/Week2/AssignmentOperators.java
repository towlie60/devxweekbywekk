package Week2;

public class AssignmentOperators {
    // ==
    // +=
    // *=
    // /=
    // %=

    //associativity: right to left
    // x = x + y
    //or, x+=y

    public static void main(String[] args) {
        int salary = 20000;
        int promo = 5000;
        //assigning
      // salary = salary + promo;
        salary%= promo;
        System.out.println(salary);
//
        int num = 2;
        int multiplier = 5;

        //num = num * multiplier

        num *= multiplier;
        System.out.println(num);

    }
}
