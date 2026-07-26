import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    try {

                        FileWriter writer = new FileWriter("students.txt", true);

                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        writer.write(id + " " + name + "\n");
                        writer.close();

                        System.out.println("Student record added.");

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:

                    try {

                        File file = new File("students.txt");

                        if (!file.exists()) {
                            System.out.println("No student records found.");
                            break;
                        }

                        Scanner reader = new Scanner(file);

                        System.out.println("\nStudent Records:");

                        while (reader.hasNextLine()) {
                            System.out.println(reader.nextLine());
                        }

                        reader.close();

                    } catch (FileNotFoundException e) {
                        System.out.println("File not found.");
                    }

                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 3);

        sc.close();
    }
}