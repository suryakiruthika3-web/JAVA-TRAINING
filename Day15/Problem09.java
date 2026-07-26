import java.util.Optional;

public class Problem09 {

    public static void main(String[] args) {

        String name = null;

        Optional<String> optional = Optional.ofNullable(name);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Value is not present.");
        }
    }
}