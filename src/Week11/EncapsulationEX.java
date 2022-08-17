package Week11;

public class EncapsulationEX {

    public static void main(String[] args) {
    employee e = new employee();
    e.setID(6);
    e.setName("Simplilearn");
    e.setSalary(3000);

        System.out.println("Name: "+e.getName());
        System.out.println("ID: " +e.getID());
        System.out.println("Salary "+e.getSalary());
  }
}