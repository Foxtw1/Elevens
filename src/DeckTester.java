/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		int[] values = {0,2,5};
		String[] ranks = {"Queen", "Jack", "King"};
		String[] suits = {"Hearts", "Spades", "Diamonds"};

		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.toString());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.toString());


	}
}
