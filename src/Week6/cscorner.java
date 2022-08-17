package Week6;

public class cscorner {
    public static void main(String[] args) {
        String str1="MyString";
        String str2="MyString";
        String str3= new String("MyString");
        String str4= new String("MYSTRING");
        if(str4.equalsIgnoreCase(str3))//==compares references
            System.out.println("We're eqaul!!");
        else
            System.out.println("we're not equal");

        //charat return char at given position
        System.out.println(str4.charAt(5));
    }
}
