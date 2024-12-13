package ie.atu.moviemanager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // List to store movies
    private static ArrayList<Movie> movieList = new ArrayList<>(); //Array list

    public static void main(String[] args) {

        // add movies to movieList
        movieList.add(new Movie("Wicked", 8.2, 160, 12)); //name,rating,length,age
        movieList.add(new Genre("WhiteChicks", 6.2, 90, 15, "comedy"));//name,rating,length,age,genre
        movieList.add(new Genre("Gladiator", 9.2, 130, 16, "Action"));

        // Create a Scanner
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0;

        // Continous Loop menu
        while (true) {
            displayMenu();

            try {
                // Checking what options the user wants in the menu
                userSelection = userInput.nextInt();

                switch (userSelection) { //switches over the methods for the app
                    case 1:
                        addMovie(userInput);//add
                        break;
                    case 2:
                        deleteMovie(userInput);//delete
                        break;
                    case 3:
                        showTotalMovies();//total
                        break;
                    case 4:
                        searchMovieByRating(userInput);//search 
                        break;
                    case 5:
                        System.out.println("Movie Manager Closing - Goodbye!");//to exit and close
                        userInput.close();
                        return;
                    default:
                        System.out.println("Invalid selection. Please choose between 1 and 5.");//options and error handling if invalid
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                userInput.nextLine(); // Clear invalid input
            }
        }
    }

    private static void displayMenu() { // Display Menu
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

    private static void addMovie(Scanner userInput) { 
        System.out.println("Enter Movie Name:");//movie name prompt String
        String name = userInput.next();
        System.out.println("Enter Movie Rating (ex.8.2):");//rating scale example 8.2 or 5.5 Float(with decimal)
        float rating = userInput.nextFloat();
        System.out.println("Enter Movie Length (in minutes):");//movie length /next double ,bigger
        Double length = userInput.nextDouble();
        System.out.println("Enter Minimum Age:");
        int age = userInput.nextInt();

        Movie newMovie = new Movie(name, length, rating, age);
        movieList.add(newMovie);
        System.out.println("Movie added successfully!");
    }

    private static void deleteMovie(Scanner userInput) {  //putting in scanner and enter name to delete movie
        System.out.println("Enter Movie Name to Delete:");
        String name = userInput.next();
        boolean found = false;
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getName().equalsIgnoreCase(name)) {
                movieList.remove(i);
                System.out.println("Movie deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Movie not found!");
        }
    }

    private static void showTotalMovies() { // displays list of movies ,loop
        System.out.println("Total Movies: " + movieList.size());
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    private static void searchMovieByRating(Scanner userInput) { //search by rating
        System.out.println("Enter Minimum Rating to Search (0.0 - 10.0):");
        try {
            float minRating = userInput.nextFloat();
            if (minRating < 0 || minRating > 10) {
                System.out.println("Invalid rating. Please enter a value between 0.0 and 10.0.");
                return;
            }

            boolean found = false;
            for (Movie movie : movieList) {
                if (movie.getRating() >= minRating) {
                    System.out.println(movie);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No movies found with rating >= " + minRating);
            }
            //add exeptions if something is put in wrong ,error handling
        } catch (Exception e) { 
            System.out.println("Invalid input. Please try again.");
            userInput.nextLine(); // Clear invalid input
        }
}// End of Main Class
}
 
        //This is the old code but i refactored it above code to allow menu
        //  Create Object
        // Movie movieObject1 = new Movie("Wicked", 8.2, 160, 12);
        // System.out.println(movieObject1.getName());
        // System.out.println(movieObject1.getLengthMin());
        // System.out.println(movieObject1.getRating());
        // System.out.println(movieObject1.getAge());

        // Genre comedyMovie = new Genre("WhiteChicks", 6.2, 90, 15, "comedy");
        // System.out.println(comedyMovie.getName());
        // System.out.println(comedyMovie.getLengthMin());
        // System.out.println(comedyMovie.getRating());
        // System.out.println(comedyMovie.getAge());
        // System.out.println(comedyMovie.getGenre());

        // Movie actionMovie = new Genre("Gladiator", 9.2, 130, 16, "Action");// movie object polymorphed to genre object
        // System.out.println(actionMovie.toString());