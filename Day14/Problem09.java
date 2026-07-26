import java.io.File;

public class Problem09 {

    public static void main(String[] args) {

        File file = new File("sample.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Unable to delete the file.");
        }
    }
}