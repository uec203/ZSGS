package movie;

public class RomComMovie extends Movie{
    private String genre;
    public RomComMovie(String title, int duration, String genre) {
        super(title, duration);
        this.genre=genre;
    }
    public void play() {
        System.out.println("\"Playing romantic comedy movie\"");
    }
    public void getMovieDetails() {
        play();
        super.getMovieDetails();
        System.out.println("Genre: " + genre);
    }
}
