import java.util.Arrays;
import java.util.Random;

/**
 * This class represents the deck itself, the cards as an array of objects in the deck and methods for each.
 *
 * @mfesta Author: Matthew Festa
 */

public class CardDeck {

    private Card[] deck;

    /**
     * Constructor for the Card Deck object
     */
    public CardDeck() {
        initialize();
    }

    /**
     * This method initializes a new deck object of 52 cards.
     */
    private void initialize() {
        this.deck = new Card[52];
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (int value = 1; value <= 13; value++) {
                this.deck[index] = new Card(suit, value);
                index++;
            }
        }
    }

    /**
     * This method randomly shuffles all cards that are currently in the deck.
     */
    public void shuffle() {
        Random shuffle = new Random();
        for (int card = 0; card < deck.length; card++) {
            int randomIndex = shuffle.nextInt(deck.length);
            Card temp = deck[card];
            deck[card] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        System.out.println("The deck has been shuffled");
    }

    /**
     * This method deals out the card that is currently at index 0 and removes it
     * @return Card at index 0
     */
    public Card dealCard() {
        Card currentCard = deck[0];

        for (int i = 0; i < deck.length; i++) {

            if (deck[i] == currentCard) {
                deck[i] = null;
                if (deck[i] == null) {
                    deck = Arrays.stream(deck)
                            .filter(card -> (card != null && deck.length > 0))
                            .toArray(Card[]::new);
                }
            }
        }
       return currentCard;
    }

    /**
     * Getter for the entire deck
     * @return deck of cards
     */
    public Card[] getDeck() {
        return deck;
    }

    /**
     * This method returns the entire array of cards on each line.
     * @return the deck as a string
     */
    @Override
    public String toString() {
        String deckString = "";
        for (Card card : deck) {
            deckString += "" + card.toString() + "\n";
        }
        return deckString;
    }
}
