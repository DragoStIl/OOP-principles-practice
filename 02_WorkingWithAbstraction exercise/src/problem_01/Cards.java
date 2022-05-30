package problem_01;

public enum Cards {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    int power;

    Cards(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());
    }

    public static String cardSuits() {
        StringBuilder cardSuits = new StringBuilder("Card Suits:" + System.lineSeparator());

        for (Object card : Cards.values()) {
            cardSuits.append(card).append(System.lineSeparator());
        }

        return cardSuits.toString();
    }
}
