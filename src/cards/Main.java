package cards;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        if(args.length==0){
            System.out.println("You need to specify how you want your hand sorted!!");
            System.exit(0);
        }
        else if(args.length>1){
            System.out.println("Please only provide one way of sorting your hand!!");
            System.exit(0);
        }
        else{
            ArrayList<Card> ms1hand = new ArrayList<Card>(6);
            ConsoleInterface ms1 = new ConsoleInterface(ms1hand);
            ms1.start();
        }
    }

}
