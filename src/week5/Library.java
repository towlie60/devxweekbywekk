package week5;

public class Library {
    public static void main(String[] args) {

        Book Java = new Book();

        Book.getPublisher();
        Java.getPublisher();

        Java.getTitle();

        Library alex = new Library();
        alex.sayHelloWorld();
    }

    public void sayHelloWorld()
    {
        System.out.println("Hello Everyone");


    }
}
