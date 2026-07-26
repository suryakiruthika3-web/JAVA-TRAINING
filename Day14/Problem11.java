import java.io.File;

public class Problem11 {

    public static void main(String[] args) {

        File oldFile = new File("sample.txt");
        File newFile = new File("newSample.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}