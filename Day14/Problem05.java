import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem05 {

    public static void main(String[] args) {

        int count = 0;

        try {

            File file = new File("sample.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }

            sc.close();

            System.out.println("Total Lines: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}