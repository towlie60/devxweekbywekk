package Week3;

public class LogicalOperators {

    public static void main(String[] args) {
        // || && !
        // || or
        // && and
        //! not

        //  boolean a = true;

        //  System.out.println(a);

        // || example, means or
        // && and
        boolean a = true || true;
        boolean b = true || false; // true because one is true
        boolean c = false || false || false; // false

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //&& and
        boolean d = false && false;
        boolean e = true && false; //false
        System.out.println(d);
        System.out.println(e);

        //! not
        boolean f = !true; // false, !false= true
        boolean g = !(true || false); // false
        System.out.println(f);
        System.out.println(g);

        int t = 3;
        int u = 4;
        boolean isSunny = false;
        boolean amHappy = false;

       // if (t < u && isSunny) { // a is less than b and isSunny is true
            if ((t < u && isSunny) || amHappy ) { // a is less than b and isSunny is true and false true,false or false = no output
            System.out.println("it's gonna be a good day!");
//        boolean v =  t > u; //false
//        boolean p = (t > u) || true; // true , if false = false
//        boolean r = (t > u) && true; //false, if true
//        boolean n = !((t < u) && true); //false
//        boolean i = !(t < u) && true; //false

//        System.out.println(v);
//        System.out.println(p);
//        System.out.println(r);
//        System.out.println(n);
//        System.out.println(i);

        }
    }
}
