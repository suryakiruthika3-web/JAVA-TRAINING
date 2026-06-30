import java.util.Scanner;

class Car {
    String brand;
    String model;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();

        System.out.print("Enter Brand: ");
        c.brand = sc.nextLine();

        System.out.print("Enter Model: ");
        c.model = sc.nextLine();

        c.display();
    }
}