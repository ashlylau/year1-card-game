import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckList {

    private List<Card> cards = new ArrayList<Card>();
    private final Random random = new Random();

    public DeckList() {

        this.cards = new ArrayList<Card>(52);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards.add((i * 13 + j), new Card(Rank.setRank(j), Suit.setSuit(i)));
            }
        }
        System.out.println(toString());
    }

    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            int index = random.nextInt(cards.size());
            Collections.swap(cards, i, index);
        }
    }

    public Card topCard() {
        Card top = cards.get(cards.size()-1);
        cards.remove(cards.size()-1);
        return top;
    }

    @Override
    public String toString() {
        return cards + "";
    }
}
