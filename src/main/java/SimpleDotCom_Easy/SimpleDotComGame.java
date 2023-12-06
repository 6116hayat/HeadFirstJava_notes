package SimpleDotCom_Easy;

public class SimpleDotComGame {
    public static void main(String[] args) {

        // Declaring variable to hold user guess
        int numOfGuesses = 0 ;

        // Making a special class
        GameHelper helper = new GameHelper();

        // Making a SimpleDotCom Object
        SimpleDotCom theDotCom = new SimpleDotCom();

        // Compute random number between 0 And 4
        int randomNum = (int) (Math.random () * 5);

        // Making an array with 3 sell location
        int [] locations = {randomNum, randomNum+1, randomNum+2};

        // Invoke sell LocationCell on the dot com object
        theDotCom.setLocationCells(locations);

        // Declare a boolean isAlive
        boolean isAlive = true ;

        // While the dot  com is alive
        while (isAlive == true){
            String  guess =  helper.getUSerInput("enter the number");

            // Invoke checkYourself on dotCom
            String result = theDotCom.checkYourself(guess);

            // Increment the numOfGuess
            numOfGuesses++;

            // IF results is "kill"
            if (result.equals("kill")) {
                isAlive =  false ;
                System.out.println("You took "+ numOfGuesses + " guesses");
            } // close if
        } // close while
    } // close main
}
