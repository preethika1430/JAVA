import java.util.Scanner;

public class TicTacToe {

    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static char currentPlayer = 'X';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {

            printBoard();
            System.out.print("Player " + currentPlayer + ", enter slot (1-9): ");

            int choice = sc.nextInt();

            // Check valid input
            if (choice < 1 || choice > 9) {
                System.out.println("Invalid slot! Choose between 1-9.");
                continue;
            }

            // Check if slot already taken
            if (board[choice - 1] == 'X' || board[choice - 1] == 'O') {
                System.out.println("Slot already taken! Try again.");
                continue;
            }

            // Place symbol
            board[choice - 1] = currentPlayer;

            // Check winner
            if (checkWinner()) {
                printBoard();
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (isDraw()) {
                printBoard();
                System.out.println("Game is Draw!");
                gameOver = true;
            }
            else {
                switchPlayer();
            }
        }
        sc.close();
    }

    // Print board
    static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---|---|---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---|---|---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    // Switch player
    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check winner
    static boolean checkWinner() {

        int[][] winPositions = {
                {0,1,2}, {3,4,5}, {6,7,8},   // rows
                {0,3,6}, {1,4,7}, {2,5,8},   // columns
                {0,4,8}, {2,4,6}              // diagonals
        };

        for (int[] pos : winPositions) {
            if (board[pos[0]] == board[pos[1]] &&
                board[pos[1]] == board[pos[2]]) {
                return true;
            }
        }
        return false;
    }

    // Check draw
    static boolean isDraw() {
        for (char c : board) {
            if (c != 'X' && c != 'O') {
                return false;
            }
        }
        return true;
    }
}