public class Problem07 {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(5,6));
        System.out.println(c.add(4,5,6));
        System.out.println(c.add(4.5,6));
        System.out.println(c.add(4,6.5));
    }
}
class Calc {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, int b) {
        return a + b;
    }
    double add(int a, double b) {
        return a + b;
    }
}
