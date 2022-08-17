package Week6;

public class StringMethods1 {

    public static void main(String[] args) {


        String name = "Billy Bob Joe";
        //method is code that does a specific task to a string

        System.out.println("Name: " + name);
        System.out.println("Uppercase:"+ name.toUpperCase());
        System.out.println("Lowercase:"+ name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("Last char: " + name.charAt(12));
        System.out.println("Substring: " + name.substring(10,13));
    }

}
