import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem08 {

    public static void main(String[] args) {

        try {

            File source = new File("sample.txt");
            File destination = new File("copy.txt");

            Scanner sc = new Scanner(source);
            FileWriter writer = new FileWriter(destination);

            while (sc.hasNextLine()) {
                writer.write(sc.nextLine());
                writer.write("\n");
            }

            sc.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}