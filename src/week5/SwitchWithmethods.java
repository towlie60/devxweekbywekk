package week5;

public class SwitchWithmethods {
    public static void main(String[] args) {

        daysInWeek(13);


    }

    private static void daysInWeek(int num) {
        switch (num) {
            case 1:
                System.out.println("This is Monday");
                break;
            case 2:
                System.out.println("This is Tuesday");
                break;
            case 3:
                System.out.println("This is Wednesday");
                break;
            case 4:
                System.out.println("This is Thursday");
                break;
            case 5:
                System.out.println("This is Friday");
                break;
            case 6:
                System.out.println("This is Saturday");
                break;
            case 7:
                System.out.println("This is Sunday");
                break;
            default:
                System.out.println("This day is Invalid");
                break;
        }
    }
}
