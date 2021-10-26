package cz.spsmb.b3i;

import java.util.Scanner;

import static cz.spsmb.b3i.Board.board;
import static cz.spsmb.b3i.Board.printBoard;
import static cz.spsmb.b3i.Main.*;

public class RoundY {
    static void roundY() {
        Scanner sc = new Scanner(System.in);
        printBoard();
        System.out.println("Now is "+nameY+"'s round (○)");
        int x2 = sc.nextInt();
        String x = "X";
        switch (x2) {
            case 1:
                if (board[2][0] == x) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[2][0] = "O";
                }
                break;
            case 2:
                if (board[2][1] == x) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[2][1] = "O";
                }
                break;
            case 3:
                if (board[2][2] == x) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[2][2] = "O";
                }
                break;
            case 4:
                if (board[1][0] == x) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[1][0] = "O";
                }
                break;
            case 5:
                if (board[1][1] == x) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[1][1] = "O";
                }
                break;
            case 6:
                if (board[1][2] == x) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[1][2] = "O";
                }
                break;
            case 7:
                if (board[0][0] == x) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[0][0] = "O";
                }
                break;
            case 8:
                if (board[0][1] == x) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[0][1] = "O";
                }
                break;
            case 9:
                if (board[0][2] == x) {
                    System.out.println("DONT CHEAT!");
                    System.out.println(nameX+" is winner");
                    System.out.println(nameY+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[0][2] = "O";
                }
                break;

        }
    }
}
