import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests
 */
public class CardTest {
    
    private Card card;
    
    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToStringDiamond4() {        
        card = new Card(Suit.DIAMOND, 4);
        System.out.println(card);
        assertEquals("DIAMOND, 4", card.toString());
        assertEquals(4, card.getValue());        
    }
    
    /**
     * Test of toString method, of class Card.
     */    
    @Test
    public void testToStringHeartQueen() {        
        card = new Card(Suit.HEART, 12);
        System.out.println(card);
        assertEquals("HEART, QUEEN", card.toString());
    }    
    
    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToStringClub7() {        
        card = new Card(Suit.CLUB, 7);
        System.out.println(card);
        assertEquals("CLUB, 7", card.toString());
    }  
    
    /**
     * Test of toString method, of class Card.
     */    
    @Test
    public void testToStringSpaceAce() {        
        card = new Card(Suit.SPADE, 1);
        System.out.println(card);
        assertEquals("SPADE, ACE", card.toString());
    }

    /**
     * Tests for Project #1
     *
     * @author Ed
     */
    public static class CardDeckTest {

        public CardDeckTest() {
        }


        @Test
        /**
         * Checks some of the cards for a new deck of cards
         * which should be in a predefined order
         */
        public void testNewDeck() {
            CardDeck deck = new CardDeck();
            Card[] deckArray = deck.getDeck();
            Card card = deckArray[0];
            assertEquals(card.getDisplayValue(), "ACE");
            assertEquals(card.getSuit(), Suit.CLUB);
            assertEquals(card.getValue(), 1);

            card = deckArray[12];
            assertEquals(card.getDisplayValue(), "KING");
            assertEquals(card.getSuit(), Suit.CLUB);
            assertEquals(card.getValue(), 13);

            card = deckArray[13];
            assertEquals(card.getDisplayValue(), "ACE");
            assertEquals(card.getSuit(), Suit.DIAMOND);
            assertEquals(card.getValue(), 1);

            card = deckArray[32];
            assertEquals(card.getDisplayValue(), "7");
            assertEquals(card.getSuit(), Suit.HEART);
            assertEquals(card.getValue(), 7);

            card = deckArray[44];
            assertEquals(card.getDisplayValue(), "6");
            assertEquals(card.getSuit(), Suit.SPADE);
            assertEquals(card.getValue(), 6);

            card = deckArray[51];
            assertEquals(card.getDisplayValue(), "KING");
            assertEquals(card.getSuit(), Suit.SPADE);
            assertEquals(card.getValue(), 13);

        }

        @Test
        /**
         * checks that the top card is removed from the deck after it is dealt
         */
        public void testDealCard() {
            CardDeck deck = new CardDeck();
            Card card = deck.dealCard();
            assertEquals(card.getDisplayValue(), "ACE");
            assertEquals(card.getSuit(), Suit.CLUB);
            assertEquals(card.getValue(), 1);

            // first card should no longer be 'in' the deck
            Card[] deckArray = deck.getDeck();
            assertNull(deckArray[0]);

        }

    }
}

