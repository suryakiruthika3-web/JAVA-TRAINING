import java.io.FileWriter;
import java.io.IOException;

public class Problem02 {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Welcome to Java File Handling.\n");
            writer.write("This is the second line.");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}