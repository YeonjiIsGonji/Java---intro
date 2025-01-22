package collection.compare.test;

import java.util.*;

public class Deck {

    private List<Card> deck = new ArrayList<>();

    public Deck() {
        initCard();
    }

    private void initCard() {
        for (int i = 1; i < 14; i++) {
            for (Suit icon : Suit.values()) {
                deck.add(new Card(i, icon));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> get() {
        List<Card> playCards = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int random = (int) Math.random();
            playCards.add(deck.remove(random));
        }
        return playCards;
    }

}
