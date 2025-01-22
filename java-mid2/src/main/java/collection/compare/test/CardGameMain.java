package collection.compare.test;

import java.util.Arrays;
import java.util.List;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        deck.shuffle();
        player1.drawCard(deck);
        player2.drawCard(deck);

        player1.showHand();
        player2.showHand();

        Player winner = getWinner(player1, player2);
        if (winner != null) {
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        int score1 = player1.getScore();
        int score2 = player2.getScore();

        if (score1 > score2) {
            return player1;
        } else if (score1 < score2) {
            return player2;
        } else {
            return null;
        }
    }
}
