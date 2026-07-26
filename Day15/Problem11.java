interface Calculator {

    static void message() {
        System.out.println("Welcome to Java 8 Static Method");
    }

    void add(int a, int b);
}

class Demo implements Calculator {

    public void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class Problem11 {

    public static void main(String[] args) {

        Calculator.message();

        Demo obj = new Demo();
        obj.add(10, 20);
    }
}