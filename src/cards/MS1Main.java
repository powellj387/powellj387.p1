package cards;


import java.util.ArrayList;

public class MS1Main {
    public static void main(String[] args)
    {
        ArrayList<Card> ms1hand = new ArrayList<Card>(6);
        ConsoleInterface ms1 = new ConsoleInterface(ms1hand);

        ms1.start();
    }
}
