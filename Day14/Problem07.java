import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {

        int count = 0;

        try {

            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                count += line.length();
            }

            sc.close();

            System.out.println("Total Characters: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}