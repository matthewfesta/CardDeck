import java.util.Scanner;

/**
 * This class performs some operations on a deck of playing cards.
 *
 * @mfesta Author: Matthew Festa
 Project 1 (Module 1 Assignment 1)
 *
 */
public class CardDealer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userSelection;
        CardDeck deck = new CardDeck();

        // Display the main menu
        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Show the deck.");
            System.out.println("2. Shuffle the deck.");
            System.out.println("3. Deal a card.");
            System.out.println("4. Deal and compare the next two cards. ");
            System.out.println("5. Start over with a new deck.");
            System.out.println("6. End Program");
            userSelection = scanner.nextInt();

            // Show the string of cards in the deck
            if (userSelection == 1) {
                String deckString = deck.toString();
                System.out.println(deckString);
            }

            // Shuffle the deck
            if (userSelection == 2) {
                deck.shuffle();
            }

            // Deal the first card in the deck
            if (userSelection == 3) {
                Card currentCard = deck.dealCard();
                System.out.println("The card is: " + currentCard.toString());

            // Compare the first two cards in the deck
            }
            if (userSelection == 4) {
                Card firstCard = deck.dealCard();
                System.out.println("The first card is: " + firstCard.toString());
                Card secondCard = deck.dealCard();
                System.out.println("The second card is: " + secondCard.toString());

                // Declare variables from the suits and values from each card.
                Suit firstSuit = firstCard.getSuit();
                Suit secondSuit = secondCard.getSuit();
                int firstValue = firstCard.getValue();
                int secondValue = secondCard.getValue();

                // Check if both suit and value are equal
                if (firstCard.equals(secondCard)) {
                    System.out.println("The suits match");
                    System.out.println("The values match");
                }

                // Check if suits are equal
                if (firstSuit.equals(secondSuit)) {
                    System.out.println("The suits match");
                } else {
                    System.out.println("The suits do not match");

                // Check if values are equal
                }
                if (firstValue == secondValue) {
                    System.out.println("The values are the same");
                } else {
                    System.out.println("The values are not the same");
                }

            // Reset the deck
            }
            if (userSelection == 5) {
                CardDeck restart = new CardDeck();
                deck = restart;

            // End the program
            }
            if (userSelection == 6) {
                System.out.println("I guess you had to shuffle out of here! Bye!");
                return;
            }

        } while (true);
    }
}
