//@author Julian Powell
package cards;
import java.util.Comparator;
public class GoFishComparator implements Comparator<Card> {
    public GoFishComparator(){}

    public int compare(Card card1, Card card2) {
        int returnVal;
        int rankDifference;
        int suitDifference;
        Card[] cardsToCompare = {card1, card2};
        int[] suitValues = {0, 0};
        int[] rankValues = {0, 0};
        //loop to place an integer value on each of the ranks due to the
        // face cards and "10" not having numerical abbrev. in the enum
        for (int i = 0; i < cardsToCompare.length; ++i) {
            if (cardsToCompare[i].getRank() == Card.Rank.ACE) {
                rankValues[i] = 1;
            } else if (cardsToCompare[i].getRank() == Card.Rank.TWO) {
                rankValues[i] = 2;
            } else if (cardsToCompare[i].getRank() == Card.Rank.THREE) {
                rankValues[i] = 3;
            } else if (cardsToCompare[i].getRank() == Card.Rank.FOUR) {
                rankValues[i] = 4;
            } else if (cardsToCompare[i].getRank() == Card.Rank.FIVE) {
                rankValues[i] = 5;
            } else if (cardsToCompare[i].getRank() == Card.Rank.SIX) {
                rankValues[i] = 6;
            } else if (cardsToCompare[i].getRank() == Card.Rank.SEVEN) {
                rankValues[i] = 7;
            } else if (cardsToCompare[i].getRank() == Card.Rank.EIGHT) {
                rankValues[i] = 8;
            } else if (cardsToCompare[i].getRank() == Card.Rank.NINE) {
                rankValues[i] = 9;
            } else if (cardsToCompare[i].getRank() == Card.Rank.TEN) {
                rankValues[i] = 10;
            } else if (cardsToCompare[i].getRank() == Card.Rank.JACK) {
                rankValues[i] = 11;
            } else if (cardsToCompare[i].getRank() == Card.Rank.QUEEN) {
                rankValues[i] = 12;
            } else if (cardsToCompare[i].getRank() == Card.Rank.KING) {
                rankValues[i] = 13;
            }
        }
        //loop to place an integer value on each of the suits
        for (int i = 0; i < cardsToCompare.length; ++i) {
            if (cardsToCompare[i].getSuit() == Card.Suit.CLUBS) {
                suitValues[i] = 1;
            } else if (cardsToCompare[i].getSuit() == Card.Suit.SPADES) {
                suitValues[i] = 2;
            } else if (cardsToCompare[i].getSuit() == Card.Suit.HEARTS) {
                suitValues[i] = 3;
            } else if (cardsToCompare[i].getSuit() == Card.Suit.DIAMONDS) {
                suitValues[i] = 4;
            }
        }

        rankDifference = rankValues[0]-rankValues[1];
        suitDifference = suitValues[0]-suitValues[1];
        //completes the comparisons necessary for sorting
        if(rankDifference==0){
            //if the ranks are the same, the suits are then compared
            returnVal = Integer.compare(suitDifference, 0);
        }
        else if (rankDifference < 0) {
            returnVal = -1;
        }
        else {
            returnVal = 1;
        }

        return returnVal;
    }
}