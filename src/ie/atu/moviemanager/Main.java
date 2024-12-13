package ie.atu.moviemanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    //Create Object
    Movie movieObject1 = new Movie("Wicked",8.2,160,12);
        System.out.println(movieObject1.getName());
        System.out.println(movieObject1.getLengthMin());
        System.out.println(movieObject1.getRating());
        System.out.println(movieObject1.getAge());

    Genre comedyMovie=new Genre("WhiteChicks", 6.2, 90, 15, "comedy");
        System.out.println(comedyMovie.getName());
        System.out.println(comedyMovie.getLengthMin());
        System.out.println(comedyMovie.getRating());
        System.out.println(comedyMovie.getAge());
        System.out.println(comedyMovie.getGenre());

     Movie actionMovie =new Genre("Gladiator", 9.2, 130, 16, "Action");//movie object polymorphed to genre object
     System.out.println(actionMovie.toString());
    
    
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


     //store user menu option selection
        userSelection = userInput.nextInt();

        if(userSelection == 5){ // Quit

            System.out.println("Student Application Closing - Goodbye!");
            //Closer the user Input Scanner
            userInput.close();
            break; //Break ot of display infinite loop

             } //End of if

         } //End of while

    } // End of Main Method

} //End of Main Class

