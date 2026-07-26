import java.util.TreeSet;

public class Problem05 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Sorted TreeSet:");
        System.out.println(numbers);
    }
}