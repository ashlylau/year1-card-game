import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private final Card[] cards;
    private int size;
    private final Random random = new Random();

    public Deck() {

        this.cards = new Card[52];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[i * 13 + j] = new Card(Rank.setRank(j), Suit.setSuit(i));
            }
        }
        System.out.println(toString());
    }

    public void order() {
        int index = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].getRank().lessThan(cards[index].getRank())) {
                swapCards(i, index);
                index = i;
            }
            if (cards[i].getRank().equals(cards[index].getRank())) {
                if (cards[i].getSuit().lessThan(cards[index].getSuit())) {
                    swapCards(i, index);
                    index = i;
                }
            }
        }
    }

    public void insertionSort() {

        Card temp;
        for (int i = 1; i < cards.length; i++) {
            for (int j = i; j > 0; j--) {
                if (cards[j].getRank().lessThan(cards[j - 1].getRank())) {
                    temp = cards[j];
                    cards[j] = cards[j - 1];
                    cards[j - 1] = temp;
                }
                if (cards[j].getRank().equals(cards[j - 1].getRank())) {
                    if (cards[j].getSuit().lessThan(cards[j - 1].getSuit())) {
                        temp = cards[j];
                        cards[j] = cards[j - 1];
                        cards[j - 1] = temp;
                    }
                }
            }
        }
    }


    public void swapCards(int a, int b) {
        Card temp = cards[a];
        cards[a] = cards[b];
        cards[b] = temp;
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int index = random.nextInt(cards.length);
            swapCards(i, index);
        }
    }

    public Card topCard() {
        Card top = cards[cards.length-1];
        Arrays.copyOf(cards, cards.length-1);
        return top;
    }

    @Override
    public String toString() {
        return Arrays.toString(cards);
    }


}
