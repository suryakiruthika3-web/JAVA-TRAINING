import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String word = input.next();

        boolean found = false;

        try {

            File file = new File("copy.txt");
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNext()) {

                String text = fileReader.next();

                if (text.equalsIgnoreCase(word)) {
                    found = true;
                    break;
                }
            }

            fileReader.close();

            if (found)
                System.out.println("Word found in the file.");
            else
                System.out.println("Word not found.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        input.close();
    }
}