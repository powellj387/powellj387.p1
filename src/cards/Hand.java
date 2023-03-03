//@author Julian Powell
package cards;
import java.util.Comparator;
public class Hand {
    Comparator<Card> handComp;
    private ULArrayList<Card> hand;
    private int currentIndex;

    public Hand(Comparator<Card> aCardComparator) {
        handComp = aCardComparator;
        hand = new ULArrayList<>();
        currentIndex = 0;
    }

    public void addCard(Card aCard) {
            hand.pushBack(aCard);
    }

    public void removeCard(Card aCard) {
        //goes through the list to find the item and when it does, removes it
        for(int i=0;i< hand.size();++i) {
            if ((aCard.getRank() == hand.get(i).getRank()) && (aCard.getSuit() == hand.get(i).getSuit())) {
                hand.removeAt(i);
            }
        }
    }

    public boolean contains (Card aCard){
        boolean isHere = false;
        //searches through the list for the item and returns true if it is found
            for(int i=0;i< hand.size();++i){
                if((aCard.getRank() == hand.get(i).getRank()) && (aCard.getSuit() == hand.get(i).getSuit())) {
                    isHere = true;
                }
            }
            return isHere;
        }

    public Card get ( int index) throws ULIndexOutOfBoundsException {
        if (index >= hand.size()){
            throw new ULIndexOutOfBoundsException();
        }
        return hand.get(index);
    }

    public int size () {
        return hand.size();
    }

    //Writing this Bubble-sorting method in order to hopefully
    // shorten up code in the consoleInterface ("+") condition
    public void compSort(){
        //nested for-loops in order to ensure that the items are in
        // the correct order rather than doing a single switch and praying
        // the next comparison needs no switching
        for(int i=0; i<hand.size()-1;++i){
            for(int j=0; j<hand.size()-1;++j){
                if(handComp.compare(hand.get(j),hand.get(j+1)) > 0){
                    //places the information of the item at "j" into a temporary
                    // variable because it is to be replaced by the item in front of it
                    Card temp = hand.get(j);
                    hand.set(j, hand.get(j+1));
                    hand.set(j+1, temp);
                }
            }
        }
    }

    public String toString () {
        return hand.toString();
    }
}

