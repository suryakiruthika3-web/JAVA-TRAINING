import java.util.HashMap;

public class Problem06 {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("Student List:");

        for (Integer key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}