package ss8_cleancode_refactor.bai_tap.tenis_game;

import java.util.Scanner;

public class TennisGameTest extends TennisGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score of player 1: ");
        int scorePlayer1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter score of player 2: ");
        int scorePlayer2 = Integer.parseInt(scanner.nextLine());

        System.out.println(getScore(scorePlayer1, scorePlayer2));
    }
}
