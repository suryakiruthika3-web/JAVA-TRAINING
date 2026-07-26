import java.util.TreeMap;

public class Problem07 {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Charlie");
        students.put(101, "Alice");
        students.put(102, "Bob");

        System.out.println("Students in Sorted Order:");

        for (Integer key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}