import java.util.Scanner;

class Book {
    String title;
    String author;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter Title: ");
        b.title = sc.nextLine();

        System.out.print("Enter Author: ");
        b.author = sc.nextLine();

        b.display();
    }
}