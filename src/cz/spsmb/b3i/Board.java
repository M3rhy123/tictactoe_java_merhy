package cz.spsmb.b3i;

class Board {
    static String[][] board = {
            {"7", "8", "9"},
            {"4", "5", "6"},
            {"1", "2", "3"}
    };

    static void printBoard() {
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓ " + board[0][0] + " ▓▓ " + board[0][1] + " ▓▓ " + board[0][2] + " ▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓ " + board[1][0] + " ▓▓ " + board[1][1] + " ▓▓ " + board[1][2] + " ▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓ " + board[2][0] + " ▓▓ " + board[2][1] + " ▓▓ " + board[2][2] + " ▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
    }
}

