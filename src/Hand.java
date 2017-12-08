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


    @Override
    public String toString() {
        return hand + "";
    }
}


