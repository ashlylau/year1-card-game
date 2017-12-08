public class Game {
    private Player player;
    private Deck deck = new Deck();
    private Hand hand = new Hand();

    public Game(Player player, Deck deck, Hand hand) {
        this.player = player;
        this.deck = deck;
        this.hand = hand;

        deck.shuffle();
        while (deck.toString().length()/4 != 0) {
            hand.addCard(deck.topCard());
        }
    }


}
