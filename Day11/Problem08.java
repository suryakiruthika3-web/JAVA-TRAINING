import java.io.IOException;

public class Problem08 {

    static void display() throws IOException {
        throw new IOException("File not found.");
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}