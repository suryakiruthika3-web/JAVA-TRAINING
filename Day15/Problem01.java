@FunctionalInterface
interface Message {
    void display();
}

public class Problem01 {

    public static void main(String[] args) {

        Message msg = () -> System.out.println("Welcome to Java 8!");

        msg.display();
    }
}