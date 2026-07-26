import java.util.Scanner;

public class NQueens {

    static int N;
    static int[][] board;

    static boolean isSafe(int row, int col) {

        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    static boolean solve(int row) {

        if (row == N)
            return true;

        for (int col = 0; col < N; col++) {

            if (isSafe(row, col)) {

                board[row][col] = 1;

                if (solve(row + 1))
                    return true;

                board[row][col] = 0;
            }
        }

        return false;
    }

    static void printBoard() {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        N = sc.nextInt();

        board = new int[N][N];

        if (solve(0))
            printBoard();
        else
            System.out.println("No Solution Exists");

        sc.close();
    }
}