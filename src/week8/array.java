package week8;

public class array {

    public static void main(String[] args) {

        int arrayOne[] = new int[10]; //define size of array

        arrayOne[0] = 12;
        arrayOne[1] = 13;
        arrayOne[2] = 14;
        arrayOne[3] = 15;
        arrayOne[4] = 25;
        arrayOne[5] = 26;
        arrayOne[6] = 27;
        arrayOne[7] = 28;

        System.out.println(arrayOne[4]);
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }

        int arrayTwo[] = {10,20,30,40,50,60}; //define size of array and in a single statement //iterate over the array

        System.out.println("Size of Second Array " + arrayTwo.length);
    }
}