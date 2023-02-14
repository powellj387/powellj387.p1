package cards;

public class Main {

    public static void main(String[] args)
    {
        Card myCard = new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS);
        System.out.println(myCard.toString());
    }

}
