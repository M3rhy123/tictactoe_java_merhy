package cz.spsmb.b3i;


import java.util.Scanner;

import static cz.spsmb.b3i.Banner.BannerTictactoe;
import static cz.spsmb.b3i.RoundX.roundX;
import static cz.spsmb.b3i.RoundY.roundY;
import static cz.spsmb.b3i.Win.win;


public class Main {
    public static int Round = 1;
    public static String nameX;
    public static String nameY;
    public static Integer penalty;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type player 1 name:");
        nameX = sc.next();
        System.out.println("Type player 2 name:");
        nameY = sc.next();
        System.out.println("How many push-ups is looser doing");
        penalty = sc.nextInt();
        BannerTictactoe();
        int start = sc.nextInt();
        switch (start) {
            case 1:
                while (true) {
                    System.out.println("Round: " + Round);
                    roundX();
                    win();
                    Round++;
                    System.out.println("Round: " + Round);
                    roundY();
                    win();
                    Round++;
                }

        }

    }


}
