package Sink_A_Dot_Com_Game;

import java.util.ArrayList;

public class DotCom {

    // DotCom's instance variable
    // -ArrayList of locations
    // -the DotCom's name
    private ArrayList<String> locationCells;
    private String name;

    // Ask setter method to update DotCom's location (Random location provided by the GameHelper placeDotCom() method)
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc ;
    }
    // basic setter method
    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "miss";

        // The ArrayList indexOf() method in action!!
        // if the user guess is one of the entries in ArrayList.indexOf() will return its ArrayList Location. If not, indexof() will return -1.
        int index = locationCells.indexOf(userInput);

        // using ArrayList's remove method
        if (index >= 0){
            locationCells.remove(index);

            // using the empty() method to see of all the locations have been guessed
            if(locationCells.isEmpty()){
                result = "kill";

                // telling the user which dot Com has been sunk
                System.out.println("Ouch! You Sunk " +name + " : (");
            } else {
                result = "hit";
            } // close if
        }// close if

        // return "hit" or "kill"
        return result;

    } // close method
}// close class
