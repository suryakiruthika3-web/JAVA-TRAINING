import java.util.Arrays;
import java.util.List;

public class Problem08 {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList(
                "Java", "Python", "C++", "JavaScript");

        System.out.println("Programming Languages:");

        languages.forEach(System.out::println);
    }
}