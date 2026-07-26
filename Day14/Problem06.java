import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem06 {

    public static void main(String[] args) {

        int count = 0;

        try {

            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                sc.next();
                count++;
            }

            sc.close();

            System.out.println("Total Words: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}