package blackJack;

public class Card {
    private int value;
    private String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public Card() {
    }

    public int getValue() {

        return value;
    }

      public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "Это карта " + this.name;
    }
}
