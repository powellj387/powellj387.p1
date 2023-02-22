
package cards;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ConsoleInterface {
    ArrayList<Card> userHand;
    Scanner scan = new Scanner(System.in);
    public ConsoleInterface(ArrayList<Card> aHand){
        userHand = aHand;
    }

    public void start() {
        boolean keepGoing = true;
        while (keepGoing) {
            String userInput = scan.nextLine();
            if (userInput.startsWith("+") && userInput.length() == 3) {
                Card.Rank cardRank = Card.convertCharToRank(userInput.charAt(1));
                Card.Suit cardSuit = Card.convertCharToSuit(userInput.charAt(2));
                if((cardRank!= Card.Rank.NO_RANK)&&(cardSuit!= Card.Suit.NO_SUIT)) {
                    Card newCard = new Card(cardRank, cardSuit);
                    userHand.add(newCard);
                }
            } else if (userInput.startsWith("-") && userInput.length() == 3) {
                Card.Rank cardRank = Card.convertCharToRank(userInput.charAt(1));
                Card.Suit cardSuit = Card.convertCharToSuit(userInput.charAt(2));
                Iterator<Card> iter = userHand.iterator();
                while(iter.hasNext()){
                    Card card = iter.next();
                    if ((cardRank==card.getRank())&&(cardSuit==card.getSuit())) {
                        iter.remove();
                    }
                }
            } else if (userInput.startsWith("p") && userInput.length() == 1) {
                for (Card card : userHand)
                    System.out.println(card);
            } else if (userInput.startsWith("q") && userInput.length() == 1) {
                System.exit(0);
            }
        }
    }
}

