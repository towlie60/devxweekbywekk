package week8;

public class PassArrayToMethod {

    public static void findMin(int arrayOne[]) { //accepts array as method and arguement
        int min = arrayOne[0]; //work on this array

        for(int i=1; i < arrayOne.length; i++){ //performing as parameter
            if(min>arrayOne[i]){
                min = arrayOne[i];
            }
        }
        System.out.println("Minimum Element is " + min); // implementation of a method
    }
    public static int[] getArray(){

        return new int[] { 12, 13, 56, 78, 90, 12, 34};
    }
    public static void main(String[] args) {
        PassArrayToMethod pass = new PassArrayToMethod(); //declare array and return to a method

        int arrayTest[] = {12,16,18,3,7,9};

        pass.findMin(arrayTest); //reference / call variable

        int arrayThree[] = pass.getArray();

        System.out.println(arrayThree[2]);
    }
}
