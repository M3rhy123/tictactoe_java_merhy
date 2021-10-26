package cz.spsmb.b3i;

import static cz.spsmb.b3i.Board.board;
import static cz.spsmb.b3i.Board.printBoard;
import static cz.spsmb.b3i.Main.*;


public class Win {
    static void win() {
        String x = "X";
        String y = "O";
        if ((board[0][0] == x && board[0][1] == x && board[0][2] == x) ||
                (board[1][0] == x && board[1][1] == x && board[1][2] == x) ||
                (board[2][0] == x && board[2][1] == x && board[2][2] == x) ||
                (board[0][0] == x && board[1][0] == x && board[2][0] == x) ||
                (board[0][1] == x && board[1][1] == x && board[2][1] == x) ||
                (board[0][2] == x && board[1][2] == x && board[2][2] == x) ||
                (board[0][0] == x && board[1][1] == x && board[2][2] == x) ||
                (board[0][2] == x && board[1][1] == x && board[2][0] == x)) {
            printBoard();
            System.out.println(nameX+" wins, congratulations");
            System.out.println(nameY+" lost, do " + penalty +"push-ups");
            System.out.println("Thanks for playing");
            System.exit(0);


        } else if ((board[0][0] == y && board[0][1] == y && board[0][2] == y) ||
                (board[1][0] == y && board[1][1] == y && board[1][2] == y) ||
                (board[2][0] == y && board[2][1] == y && board[2][2] == y) ||
                (board[0][0] == y && board[1][0] == y && board[2][0] == y) ||
                (board[0][1] == y && board[1][1] == y && board[2][1] == y) ||
                (board[0][2] == y && board[1][2] == y && board[2][2] == y) ||
                (board[0][0] == y && board[1][1] == y && board[2][2] == y) ||
                (board[0][2] == y && board[1][1] == y && board[2][0] == y)) {
            printBoard();
            System.out.println(nameY+" wins, congratulations");
            System.out.println(nameX+" lost, do" + penalty +"push-ups");
            System.out.println("Thanks for playing");
            System.exit(0);

        } else if (Round == 9) {
            System.out.println("DRAW!");
            System.out.println("Thanks for playing");
            System.exit(0);
        }


    }
}
