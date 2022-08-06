/**
 * This class represents the cards using suits and values.
 *
 * @mfesta Author: Matthew Festa
 */

public class Card {


    private Suit suit;
    private int value;


    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    // Get and set suits.
    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    // Get and set values.
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    /**
     * This method returns the display value of the card as a string.
     * @return String display value
     */
    public String getDisplayValue() {
        String displayValue = "";
        if (value == 1) {
            displayValue = "ACE";
        }
        if (value == 2) {
            displayValue = "2";
        }
        if (value == 3) {
            displayValue = "3";
        }
        if (value == 4) {
            displayValue = "4";
        }
        if (value == 5) {
            displayValue = "5";
        }
        if (value == 6) {
            displayValue = "6";
        }
        if (value == 7) {
            displayValue = "7";
        }
        if (value == 8) {
            displayValue = "8";
        }
        if (value == 9) {
            displayValue = "9";
        }
        if (value == 10) {
            displayValue = "10";
        }
        if (value == 11) {
            displayValue = "JACK";
        }
        if (value == 12) {
            displayValue = "QUEEN";
        }
        if (value == 13) {
            displayValue = "KING";
        }
        if (value < 1 || value > 13) {
            displayValue = "invalid";
        }
        return displayValue;
    }

    /**
     * This method returns the "face" of the card as a String.
     * @return Suit, display value
     */
    @Override
    public String toString() {
        return  suit + ", " + getDisplayValue();
    }

    /**
     * This method asserts if both the suit and value are equal.
     * @param that Card.
     * @return true if both conditions are met, false otherwise
     */
    public boolean equals(Card that) {
        if (this.value == that.value && this.suit == that.suit) {
            return true;
        } else {
            return false;
        }

    }

}
