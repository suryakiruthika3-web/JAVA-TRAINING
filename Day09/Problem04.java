public class Problem04 {
    public static void main(String args[]){
        Circle r1 = new Circle();
        r1.calculateArea(7);
    }
}
class Circle {
    double radius;
    void calculateArea(double radius) {
        System.out.println("Area of Circle is: "+(3.14 * radius * radius));
    }
}
