import java.util.Scanner;

public class KnightTour {

    static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if (r < 0 || r >= chess.length || c < 0 || c >= chess.length || chess[r][c] != 0) {
            return;
        }
        if (upcomingMove == chess.length * chess.length) {
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = upcomingMove;

        // printKnightsTour(chess, r - 2, c + 1, upcomingMove + 1);
        // printKnightsTour(chess, r - 1, c + 2, upcomingMove + 1);
        // printKnightsTour(chess, r + 1, c + 2, upcomingMove + 1);
        // printKnightsTour(chess, r + 2, c + 1, upcomingMove + 1);
        // printKnightsTour(chess, r + 2, c - 1, upcomingMove + 1);
        // printKnightsTour(chess, r + 1, c - 2, upcomingMove + 1);
        // printKnightsTour(chess, r - 1, c - 2, upcomingMove + 1);
        // printKnightsTour(chess, r - 2, c - 1, upcomingMove + 1);

        for (int d = 0; d < dir.length; d++) {
            int x = r + dir[d][0];
            int y = c + dir[d][1];
            printKnightsTour(chess, x, y, upcomingMove + 1);
        }
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess, r, c, 1);
    }
}
