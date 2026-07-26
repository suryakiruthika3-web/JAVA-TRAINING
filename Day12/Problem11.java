import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Java");

        sb.insert(4, " Programming");

        System.out.println(sb);

        sc.close();
    }
}