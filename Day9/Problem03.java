public class Problem03 {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        r1.calculateArea(5, 3);
    }
}
class Rectangle {
    int length;
    int breadth;
    void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle is: "+(length*breadth));
    }
}
