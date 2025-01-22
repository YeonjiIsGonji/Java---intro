package collection.compare.test;

import java.util.Comparator;
import java.util.Iterator;

public class Card implements Comparable<Card> {
    private int num;
    private final Suit icon;

    public Card(int num, Suit icon) {
        this.icon = icon;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public Suit getIcon() {
        return icon;
    }

    @Override
    public int compareTo(Card o) {
        if (this.num != o.num) {
            return Integer.compare(this.num, o.num);
        } else {
            return this.icon.compareTo(o.icon);
        }
    }

    @Override
    public String toString() {
        return num + "(" + icon.getIcon() + ")";
    }
}
