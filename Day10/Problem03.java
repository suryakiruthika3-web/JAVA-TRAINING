public class Problem03 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
        Shape s2 = new Rectangle();
        s2.draw();
    }
}
interface Shape{
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}