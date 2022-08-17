package Week6;

public class Main2 {

    public static void main(String[] args) {

        //String input = "Simplilearn";
        String input = "malayalam";

        StringBuilder input1 = new StringBuilder();

        input1.append(input);
        input1 = input1.reverse();

        System.out.println("The reverse string is: "+input1);


    }
}
