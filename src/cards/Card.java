//@author Julian Powell
package cards;
public class Card{
    public enum Rank
    {
        TWO("2"),THREE("3"),TEN("T"),SIX("6"),SEVEN("7"),
        QUEEN("Q"),NO_RANK(""),NINE("9"),KING("K"),
        JACK("J"),FOUR("4"),FIVE("5"),EIGHT("8"),ACE("A");

        private String abbreviation;

        Rank(String abbrev)
        {
            abbreviation = abbrev;
        }

        public String getAbbreviation()
        {
            return abbreviation;
        }
    }

    public enum Suit
    {
        SPADES("S"),NO_SUIT(""),HEARTS("H"),DIAMONDS("D"),CLUBS("C");

        private String abbreviation;

        Suit(String abbrev)
        {
            abbreviation = abbrev;
        }

        public String getAbbreviation()
        {
            return abbreviation;
        }
    }

    Card.Rank cardRank;
    Card.Suit cardSuit;

    public void Card()
    {
    }

    public Card(Card.Rank aRank, Card.Suit aSuit)
    {
        cardRank = aRank;
        cardSuit = aSuit;
    }

   public static Card.Suit convertCharToSuit(char suitChar)
    {
        Suit suit = switch (suitChar){
            case 'C'->Suit.CLUBS;
            case 'D'->Suit.DIAMONDS;
            case 'H'-> Suit.HEARTS;
            case 'S'-> Suit.SPADES;
            default->Suit.NO_SUIT;
        };
        return suit;
    }

    public static Card.Rank convertCharToRank(char rankChar)
    {
        Rank rank = switch (rankChar){
            case '2'->Rank.TWO;
            case '3'->Rank.THREE;
            case '4'-> Rank.FOUR;
            case '5'-> Rank.FIVE;
            case '6'-> Rank.SIX;
            case '7'-> Rank.SEVEN;
            case '8'-> Rank.EIGHT;
            case '9'-> Rank.NINE;
            case 'T'-> Rank.TEN;
            case 'J'-> Rank.JACK;
            case 'Q'-> Rank.QUEEN;
            case 'K'-> Rank.KING;
            case 'A'-> Rank.ACE;
            default->Rank.NO_RANK;
        };
        return rank;
    }

    public Card.Suit getSuit()
    {
        return cardSuit;
    }

    public Card.Rank getRank()
    {
        return cardRank;
    }

    public boolean equals(Card cardToCheck) {return cardRank==cardToCheck.getRank()&&cardSuit==cardToCheck.getSuit();}

    public String toString()
    {
        return cardRank.getAbbreviation()+cardSuit.getAbbreviation();
    }
}
