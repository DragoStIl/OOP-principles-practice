package problem_01;

public enum Ranks {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    int power;

    Ranks(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }


    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", ordinal(), name());
    }

    public static String cardRanks() {
        StringBuilder cardSuits = new StringBuilder("Card Ranks:" + System.lineSeparator());

        for (Object rang : Ranks.values()) {
            cardSuits.append(rang).append(System.lineSeparator());
        }

        return cardSuits.toString();
    }
}
