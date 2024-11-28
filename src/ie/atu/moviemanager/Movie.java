package ie.atu.moviemanager;

public class Movie {

    //instance variables
    private String name; //name of movie
    private double lengthMin; //minutes of movie
    private float rating; //rating of reviews for movie 
    private int age; //age for movie

    // Constructor
    public Movie(String name, double lengthMin, float rating, int age) {
        this.name = name;
        this.lengthMin = lengthMin;
        this.rating = rating;
        this.age = age;
    }


}
