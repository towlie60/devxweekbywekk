package Week11;

public class Encap2 {

    public static void main(String[] args) {
        cars c = new cars("BMW", "$30000","200kmph");
        System.out.println("Name :" +c.getName()+" Price : "+c.getPrice()+ " Top speed :"+c.getTopspeed());
        System.out.println("Stats after updation");
        c.setPrice("$50000");
        c.setTopspeed("250kmph");
        System.out.println("Name :" +c.getName()+" Price : "+c.getPrice()+ " Top speed :"+c.getTopspeed());

    }
}
