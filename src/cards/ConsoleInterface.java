
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

    public void start(){
        boolean keepAdding = true;
        while(keepAdding){
            String userInput = scan.nextLine();
            if(userInput.startsWith("+"))
            {
             Card.Rank cardRank=Card.convertCharToRank(userInput.charAt(1));
             Card.Suit cardSuit=Card.convertCharToSuit(userInput.charAt(2));
                Card newCard = new Card(cardRank,cardSuit);
                userHand.add(newCard);
            } else if (userInput.startsWith("-")){
                Card.Rank cardRank=Card.convertCharToRank(userInput.charAt(1));
                Card.Suit cardSuit=Card.convertCharToSuit(userInput.charAt(2));
                Card cardToRemove = new Card(cardRank,cardSuit);
                userHand.remove(cardToRemove);
            }else if(userInput.startsWith("p")){
                for(Card card: userHand)
                    System.out.println(card);
            }else if(userInput.startsWith("q")){
                System.exit(0);
            }
            }
        }
    }

