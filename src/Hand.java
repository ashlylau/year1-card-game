import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {

    private ArrayList<Card> hand = new ArrayList<Card>();

    public Hand() {
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card getCard(int i) {
        return hand.get(i);
    }

    public void remove(Card card) {
        hand.remove(card);
    }

    public int getCardCount() {
        return hand.size();
    }

    public void sortHand() {
        int index = 0;
        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).getSuit().lessThan(hand.get(index).getSuit())) {
                Collections.swap(hand, i, index);
                index = i;
            }
            if (hand.get(i).getSuit().equals(hand.get(index).getSuit())) {
                if (hand.get(i).getRank().lessThan(hand.get(index).getRank())) {
                    Collections.swap(hand, i, index);
                    index = i;
                }
            }

        }
    }

    public void insertionSort() {

        Card temp;
        for (int i = 1; i < hand.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (hand.get(j).getRank().lessThan(hand.get(j - 1).getRank())) {
                    temp = hand.get(j);
                    hand.set(j, hand.get(j - 1));
                    hand.set(j - 1, temp);
                }
                if (hand.get(j).getRank().equals(hand.get(j - 1).getRank())) {
                    if (hand.get(j).getSuit().lessThan(hand.get(j - 1).getSuit())) {
                        temp = hand.get(j);
                        hand.set(j, hand.get(j - 1));
                        hand.set(j - 1, temp);
                    }
                }
            }
        }
    }


    @Override
    public String toString() {
        return hand + "";
    }
}


