package cz.spsmb.b3i;

import java.util.Scanner;

import static cz.spsmb.b3i.Board.board;
import static cz.spsmb.b3i.Board.printBoard;
import static cz.spsmb.b3i.Main.*;

public class RoundX {

    static void roundX() {
        Scanner sc = new Scanner(System.in);
        printBoard();
        System.out.println("Now is "+ nameX +"'s round (X)");
        int x1 = sc.nextInt();
        String y = "O";
        switch (x1) {
            case 1:
                if (board[2][0] == y) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[2][0] = "X";
                }
                break;
            case 2:
                if (board[2][1] == y) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[2][1] = "X";
                }
                break;
            case 3:
                if (board[2][2] == y) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[2][2] = "X";
                }
                break;
            case 4:
                if (board[1][0] == y) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[1][0] = "X";
                }
                break;
            case 5:
                if (board[1][1] == y) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[1][1] = "X";
                }
                break;
            case 6:
                if (board[1][2] == y) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[1][2] = "X";
                }
                break;
            case 7:
                if (board[0][0] == y) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[0][0] = "X";
                }
                break;
            case 8:
                if (board[0][1] == y) {
                    System.out.println("DONT CHEAT");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[0][1] = "X";
                }
                break;
            case 9:
                if (board[0][2] == y) {
                    System.out.println("DONT CHEAT!");
                    System.out.println(nameY+" is winner");
                    System.out.println(nameX+" lost, do " + penalty +"push-ups");
                    System.exit(0);
                } else {
                    board[0][2] = "X";
                }
                break;

        }
    }

}
