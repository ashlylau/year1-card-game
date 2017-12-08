public enum Rank {
    ACE("A"),TWO("2"),THREE("3"),FOUR("4"),FIVE("5"),SIX("6"),SEVEN("7"),
    EIGHT("8"),NINE("9"),TEN("10"),JACK("J"),QUEEN("Q"),KING("K");

    private final String representation;

    Rank(String representation) {
        this.representation = representation;
    }

    public boolean equals(Rank r) {
        return this.ordinal() == r.ordinal();
    }

    public boolean lessThan(Rank r) {
        return this.ordinal() < r.ordinal();
    }

    public String toString() {
        return representation;
    }

    public static Rank setRank(int i) {
        switch (i) {
            case 0:
                return Rank.ACE;
            case 1:
                return Rank.TWO;
            case 2:
                return Rank.THREE;
            case 3:
                return Rank.FOUR;
            case 4:
                return Rank.FIVE;
            case 5:
                return Rank.SIX;
            case 6:
                return Rank.SEVEN;
            case 7:
                return Rank.EIGHT;
            case 8:
                return Rank.NINE;
            case 9:
                return Rank.TEN;
            case 10:
                return Rank.JACK;
            case 11:
                return Rank.QUEEN;
            default:
                return Rank.KING;
        }
    }
}


