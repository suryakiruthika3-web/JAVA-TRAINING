import java.util.Scanner;

class Mobile {
    String brand;
    double price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mobile m = new Mobile();

        System.out.print("Enter Brand: ");
        m.brand = sc.nextLine();

        System.out.print("Enter Price: ");
        m.price = sc.nextDouble();

        m.display();
    }
}