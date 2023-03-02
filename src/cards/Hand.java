
package cards;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Hand {
    private Comparator<Card> handComp;
    private ArrayList<Card> hand;
    private int currentIndex = 0;


    public Hand(Comparator<Card> aCardComparator) {
        handComp = aCardComparator;
        hand = new ArrayList<Card>();
    }

    public void addCard(Card aCard) {
        hand.set(currentIndex, aCard);
        currentIndex++;
    }

    public void removeCard(Card aCard) {
        Iterator<Card> iter = hand.iterator();
        while (iter.hasNext()) {
            Card card = iter.next();
            if ((aCard.getRank() == card.getRank()) && (aCard.getSuit() == card.getSuit())) {
                iter.remove();
            }
        }
    }

    public boolean contains (Card aCard){
        boolean isHere = false;
            for(Card card: hand){
                if((aCard.getRank() == card.getRank()) && (aCard.getSuit() == card.getSuit())) {
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

    public String toString () {
        return hand.toString();
    }
}

