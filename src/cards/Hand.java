
package cards;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Hand {
    private Comparator<Card> handComp;
    private ArrayList<Card> hand;
    private int currentIndex = 0;


    public Hand(Comparator<Card> aCardComparator) {
        handComp = aCardComparator;
        hand = new ArrayList<Card>(6);
    }

    public void addCard(Card aCard) {
        hand.set(currentIndex, aCard);
        currentIndex++;
    }
}

  /*  public void removeCard(Card aCard){

    }

    public boolean contains(Card aCard){

    }

    public Card get(int index) throws ULIndexOutOfBoundsException{

    }

    public int size(){

    }

    public String toString(){

    }
}*/

