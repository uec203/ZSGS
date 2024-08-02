package movie;

public class ThrillerMovie extends Movie{
    private String genre;
    public ThrillerMovie(String title, int duration, String genre) {
        super(title, duration);
        this.genre=genre;
    }
    public void play() {
        System.out.println("\"Playing thriller movie\"");
    }
    public void getMovieDetails() {
        play();
        super.getMovieDetails();
        System.out.println("Genre: " + genre);
    }
}
