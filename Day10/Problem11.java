public class Problem11 {
    public static void main(String[] args) {
        calculator calc = new CalculatorImpl();
        System.out.println("Addition: " + calc.add(10, 20));
        System.out.println("Subtraction: " + calc.subtract(20, 10));
        System.out.println("Multiplication: " + calc.multiply(10, 20));
        System.out.println("Division: " + calc.divide(20, 10));
    }
}
interface calculator{
    int add(int a,int b);
    int subtract(int a,int b);
    int multiply(int a,int b);
    double divide(int a,int b);
}
class CalculatorImpl implements calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public double divide(int a,int b){
        return (double)a/b;
    }
}