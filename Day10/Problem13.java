interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}

class Car {
    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
    }
}

public class Problem13 {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();
        Car car = new Car(engine);
        car.drive();
    }
}