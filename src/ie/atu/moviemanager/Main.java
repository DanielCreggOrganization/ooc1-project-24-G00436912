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


}
