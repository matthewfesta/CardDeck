import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests
 */
public class CardDeckTest {
    
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
