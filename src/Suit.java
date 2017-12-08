public enum Suit {
    DIAMONDS("D"), CLUBS("C"),HEARTS("H"),SPADES("S");

    private final String representation;

    Suit(String representation) {

        this.representation = representation;
    }

    public boolean equals(Suit s) {
        return this.ordinal() == s.ordinal();
    }

    public boolean lessThan(Suit s) {
        return this.ordinal() < s.ordinal();
    }

    public String toString() {
        return representation;
    }

    public static Suit setSuit(int i) {
        switch (i) {
            case 0:
                return Suit.DIAMONDS;
            case 1:
                return Suit.CLUBS;
            case 2:
                return Suit.HEARTS;
            default:
                return Suit.SPADES;
            }
        }
    }
