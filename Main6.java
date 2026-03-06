
class Media {
    String title;
    int year;

    void play() {
        System.out.println("Now playing: " + title);
    }
}


class Movie extends Media {
    String director;
    double duration;


    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
    }
}


public class Main6 {
    public static void main(String[] args) {
       
        Movie myMovie = new Movie();

    
        myMovie.title = "Inception";
        myMovie.year = 2010;

     
        myMovie.director = "Christopher Nolan";


        myMovie.displayDetails(); // From Child
        myMovie.play();           // Inherited from Parent
    }
}