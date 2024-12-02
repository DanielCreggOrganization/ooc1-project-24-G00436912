package ie.atu.moviemanager;
//encapsulation ,private and cant be edited from other classes

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

    // Getter methods
    public String getName() {
        return this.name;
    }

    public double getLengthMin() {
        return this.lengthMin;
    }

    public float getRating() {
        return this.rating;
    }

    public int getAge() {
        return this.age;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLengthMin(double lengthMin) {
        this.lengthMin = lengthMin;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

}
