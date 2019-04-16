1.  Random Deck
    Compare
    shuffle

2.  
    1.  Shuffle deck
    2.  Select 9 cards that can be matched
    3.  Check to see if there are no matching pairs
    4.  If there are no matching pairs, then state the game is over
    5.  If the pairs that are selected add up to 11, or are a J, Q, and K, then remove them       from the deck
    6.  If not, then do nothing
    7.  If there are cards removed from the deck, then put two more random cards up to be         selected. If the removed cards are a J, Q, and K then add three more cards. 
    8.  Check if there are more cards in the deck, if there are none, then say the user won
    9.  If there are cards left, then repeat all of the steps.

3.  The code does not open an application to play the game unless you wanted to play it on the terminal. It also doesn't check for elevens or J, Q, K (Has missing methods).

4. 
    a.  Line 206
    b.  anotherPlayIsPossible
    c.  J, 6, 2, A, 4
    d.
public static void printCards(ElevensBoard board){
    List<Integer> cardIndexes = board.cardIndexes();
    for(int i = 0; i < cardIndexes.length; i++){
        System.out.println(cIndexes[i] + ", ");
    }
}
    e.  anotherPlayPossible because it needs to check a card, not a null. It needs some way to skip the nulls, and the cardIndex is a premade way to do that.