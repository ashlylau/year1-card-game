import org.junit.Test;


public class TestDecks {

    @Test
    public void deckTest(){
        Deck d = new Deck();
        d.shuffle();
        System.out.println(d.toString());
        d.shuffle();
        System.out.println(d.toString());
        d.insertionSort();
        System.out.println(d.toString());
    }

    @Test
    public void deckListTest() {

        DeckList d = new DeckList();
        d.shuffle();
        System.out.println(d.toString());
    }

    @Test
    public void handTest() {
        Hand h = new Hand();
        h.addCard(new Card(Rank.ACE, Suit.DIAMONDS));
        h.addCard(new Card(Rank.TEN, Suit.DIAMONDS));
        h.addCard(new Card(Rank.TWO, Suit.DIAMONDS));
        h.addCard(new Card(Rank.SEVEN, Suit.HEARTS));
        h.addCard(new Card(Rank.SIX, Suit.CLUBS));
        System.out.println(h.toString());
        h.insertionSort();
        System.out.println(h.toString());
    }


}
