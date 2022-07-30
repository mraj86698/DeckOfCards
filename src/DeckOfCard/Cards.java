package DeckOfCard;

import java.util.ArrayList;

public class Cards {
	/**
	 * Simply created a Welcome Message Method without any return type.
	 */
	 public void welcome() {

	        System.out.println("Welcome to the gaming world of Deck of Cards");

	    }

	 public ArrayList<String> cardsDeck = new ArrayList<String>();

	 /**
	  * In this method we have initialized the size of cards.
	  * In this I have created String type array of Suits and Ranks to store its value and initialize it.
	  * In this we are printing the size of card.
	  * In this method we are also printing all the possible combination of card.
	  */
	 public void deckOfCards() {

	        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

	        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};

	        int numOfCards = suits.length * ranks.length;

	        System.out.println("\nNumber of cards in the deck is : " + numOfCards);

	        // First we have to iterate for loop for ranks starting from index 0.
	        for (int i = 0; i < ranks.length; i++) {

	            // Now we have to iterate the suits for all the indexes of ranks
	            for (int j = 0; j < suits.length; j++) {

	                cardsDeck.add(ranks[i] + "----->" + suits[j]);
	            }
	        }
	        toDisplay(cardsDeck);
	    }

	 /**
	  * Created a display method to print the array list of cardsDeck.
	  * We are using for-each loop to print all the element of ArrayList.
	  * We are storing all the elements of cardsDeck arraylist in element.
	  * @param cardsDeck
	  */

	 public static void toDisplay(ArrayList<String> cardsDeck) {

	        System.out.println("\nCards in Deck:");

	        for (String element : cardsDeck) {

	            System.out.println(element);

	        }

	        System.out.println();
	    }

}
