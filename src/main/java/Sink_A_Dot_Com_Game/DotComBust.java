package Sink_A_Dot_Com_Game;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class DotComBust {

    // Declare and initialize the variables we need
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;


    private void setUpGame() {
        // Making three DotCom objects give'em names and stick'em in ArrayList
        // first make some dot coms and give some locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("Go2.com");
        DotCom three = new DotCom();
        three.setName("AskMe.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        // Printing the instructions for the user
        System.out.println("Your goal is to sink down three dot coms");
        System.out.println("Pets.com, Go2.com And AskMe.com");
        System.out.println("Try to sink them all in fewer number of guesses");

        // Repeating each DotCom with the list
        for (DotCom dotComToSet : dotComList){

            //Ask the helper to set the DotCom location
            ArrayList<String> newLocation = helper.placeDotCom(3);

            // Call the setter method on this DotCom to give it to the location
            dotComToSet.setLocationCells (newLocation);
        }// close for loop
    } // close setUpGame method

    private void startPlaying(){
        // As long as DotCom is not empty
        while(!dotComList.isEmpty()){

            // get user Input
            String userGuess = helper.getUserInput("Enter a guess");

            // check user guess method
            checkUserGuess(userGuess);
        }// close while

        // call our finish method
        finishGame();

    } // close startPlaying Method

    private void checkUserGuess(String userGuess){
        // increment the user guess method
        numOfGuesses++;

        // assume it as "miss", unless told
        String result = "miss";

        // repeat with all DotComs in the list
        for (DotCom dotComTest : dotComList){

            // ask the DotCom to check the user guess, looking for "hit" or "kill"
            result = dotComTest.checkYourself(userGuess);

            if (result.equals("hit")){
                // get out of the loop at early point
                break;
            }
            if (result.equals("kill")){

                // this guy is dead remove it from the DotCom list
                dotComList.remove(dotComTest);
                break;
            }
        }// close for
        // print the result for the user
        System.out.println(result);
    } // close method

    private void finishGame(){
        // print the result, how the user did in the game
        System.out.println("All Dot Coms are dead! Your stock is now worthless");
        if (numOfGuesses < 18){
            System.out.println("It only took you " +numOfGuesses + "guesses.");
            System.out.println("You got out before your options sank.");
        } else{
            System.out.println("Took you long enough." +numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options");
        }
    } // close method

    public static void main(String[] args) {

        // create the game object
        DotComBust game = new DotComBust();

        //tell the game object to set up the game
        game.setUpGame();

        //tell game object to start main game loop (ask the user for input and keeps checking)
        game.startPlaying();
    }

}
