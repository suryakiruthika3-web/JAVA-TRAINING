import java.util.ArrayList;

public class Problem03 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        list.forEach(language -> System.out.println(language));
    }
}