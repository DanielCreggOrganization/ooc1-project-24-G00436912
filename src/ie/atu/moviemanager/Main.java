package ie.atu.moviemanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Create Object
    Movie movieObject1 = new movie(Wicked,8.2,160,12)
        System.out.println(movieObject1.getname());
        System.out.println(movieObject1.getlengthMin());
        System.out.println(movieObject1.getrating());
        System.out.println(movieObject1.getage());
    }
    //Create a Scanner
    Scanner userInput = new Scanner(System.in);
    int userSelection = 0; //Used to store user Menu option selection

    //Create infinite while loop to display Menu after every command
    while(true){
        //Display Menu to console
        System.out.println("");
        System.out.println("###############################");
        System.out.println("# Studient Applicarion v0.9 #");
        System.out.println("###############################");
        System.out.println("(1) Add a Movie.");
        System.out.println("(2) Delete a Movie.");
        System.out.println("(3) Show total number of Movies.");
        System.out.println("(4) Search for a Movie by Movie rating.");
        System.out.println("(5) Quit.");
        System.out.println("Select an option from 1 to 5 and press Enter");

}
     //store user menu option selection
        userSelection = userInput.nextInt();

    
}
