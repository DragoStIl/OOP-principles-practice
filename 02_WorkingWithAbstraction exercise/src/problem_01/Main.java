package problem_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String rank = scan.nextLine();
        String suit = scan.nextLine();

        System.out.printf("Card name: %s of %s; Card power: %d"
                , rank, suit
                , Cards.valueOf(suit).getPower() + Ranks.valueOf(rank).getPower());

    }
}
