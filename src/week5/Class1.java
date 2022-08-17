package week5;

public class Class1 {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 10;
//        System.out.println(a * b);

        welcome();
        multiply(5, 10);
        multiply(100, 5);
        multiply(21, 15);
        divide(20,5);
        divide(100,10);
        divide(500,50);

//        int c = 100;
//        int d = 5;
//        System.out.println(c * d);
//
//        int e= 21;
//        int f= 15;
//        System.out.println(e * f);
    }

    public static void welcome() {
        System.out.println("Welcome to our calculator!");

}

    public static void multiply(int a, int b) {
        System.out.println(a * b);

    }
    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
