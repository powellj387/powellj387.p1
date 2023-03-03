//@author Julian Powell
package cards;
import java.util.Scanner;
public class ConsoleInterface {
    Hand userHand;
    Scanner scan = new Scanner(System.in);
    public ConsoleInterface(Hand aHand){
        userHand = aHand;
    }

    public void start() {
        boolean keepGoing = true;
        while (keepGoing) {
            String userInput = scan.nextLine();
            //process for adding a card
            if (userInput.startsWith("+") && userInput.length() == 3) {
                Card.Rank cardRank = Card.convertCharToRank(userInput.charAt(1));
                Card.Suit cardSuit = Card.convertCharToSuit(userInput.charAt(2));
                //checks to ensure that the card wanting to be added does not include any null values
                if((cardRank!= Card.Rank.NO_RANK)&&(cardSuit!= Card.Suit.NO_SUIT)) {
                    Card newCard = new Card(cardRank, cardSuit);
                    userHand.addCard(newCard);
                    userHand.compSort();
                }
                //process for removing a card
            } else if (userInput.startsWith("-") && userInput.length() == 3) {
                Card.Rank cardRank = Card.convertCharToRank(userInput.charAt(1));
                Card.Suit cardSuit = Card.convertCharToSuit(userInput.charAt(2));
                Card cardToDelete = new Card(cardRank,cardSuit);
                //checks to ensure that the card is in the hand prior to running the remove function
                if(userHand.contains(cardToDelete)){
                    userHand.removeCard(cardToDelete);
                    userHand.compSort();
                }
                //process for printing the hand out
            } else if (userInput.startsWith("p") && userInput.length() == 1) {

                System.out.println(userHand.toString());
                //process for quitting the program
            } else if (userInput.startsWith("q") && userInput.length() == 1) {
                System.exit(0);
            }
        }
    }
}

