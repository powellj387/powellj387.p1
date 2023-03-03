//@author Julian Powell
package cards;
public class Main {
    public static void main(String[] args)
    {
        //ensures there is an argument passed through the command line
        if(args.length==0){
            System.out.println("You need to specify how you want your hand sorted!!");
            System.exit(0);
        }
        //ensures only one argument is passed through the command line
        else if(args.length>1){
            System.out.println("Please only provide one way of sorting your hand!!");
            System.exit(0);
        }
        else{
            //the next three statements run the program depending on the command given
            if(args[0].equals("--hearts")){
               HeartsComparator handComp = new HeartsComparator();
               Hand handToSort = new Hand(handComp);
                ConsoleInterface handInterface = new ConsoleInterface(handToSort);
                handInterface.start();
            }else if(args[0].equals("--spades")){
                SpadesComparator handComp = new SpadesComparator();
                Hand handToSort = new Hand(handComp);
                ConsoleInterface handInterface = new ConsoleInterface(handToSort);
                handInterface.start();
            }else if(args[0].equals("--gofish")){
                GoFishComparator handComp = new GoFishComparator();
                Hand handToSort = new Hand(handComp);
                ConsoleInterface handInterface = new ConsoleInterface(handToSort);
                handInterface.start();
            //if there is one command given, but it is not a part of the list of valid ones
            }else {
                System.out.println("Please enter a valid sorting method!!");
                System.exit(0);
            }
        }
    }

}
