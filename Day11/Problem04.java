public class Problem04 {
    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println("Length = " + name.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String is null.");
        }
    }
}