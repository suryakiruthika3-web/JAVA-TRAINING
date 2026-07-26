interface Vehicle {

    default void start() {
        System.out.println("Vehicle Started");
    }

    void drive();
}

class Car implements Vehicle {

    public void drive() {
        System.out.println("Car is Driving");
    }
}

public class Problem10 {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.drive();
    }
}