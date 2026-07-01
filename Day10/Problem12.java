public class Problem12 {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.start();
    }
}
class Car{
    class Engine{
        void start(){
            System.out.println("Engine started");
        }
    }
}