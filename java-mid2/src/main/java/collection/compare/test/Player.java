package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        hand = deck.get();
    }

    public int getScore() {
        int score = 0;
        for (Card card : hand) {
            score += card.getNum();
        }
        return score;
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name + "의 카드: " + hand + ", 합계: " + getScore());
    }

    public String getName() {
        return name;
    }
}
