import java.util.HashSet;

public class Problem04 {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Asha");
        names.add("Rahul");
        names.add("Asha");
        names.add("Kiran");

        System.out.println("HashSet Elements:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}