package ie.atu.moviemanager;
//Inheritance,

public class Genre extends Movie{
    private String Genre;
    public Genre(String name, double lengthMin, float rating, int age, String Genre){
        super( name,lengthMin,rating,age);
        this.Genre = Genre;
    }
    public String getGenre() {
        return this.Genre;
    }



}
