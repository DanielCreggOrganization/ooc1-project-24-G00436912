package ie.atu.moviemanager;
//Inheritance,uses extend to take the getters from movie class.

public class Genre extends Movie{
    //adds a genre field to movie
    private String Genre;
    public Genre(String name, double lengthMin, float rating, int age, String Genre){
        super( name,lengthMin,rating,age);
        this.Genre = Genre;
    }
    public String getGenre() {
        return this.Genre;
    }
    //exactly like the overide in movie but just adds genre to it
    @Override 
    public String toString(){
        return "GenreMovie ="+this.getName()+" "+this.getLengthMin()+" "+this.getRating()+" "+this.getAge()+" "+this.getGenre()+".";
    }
    


}
