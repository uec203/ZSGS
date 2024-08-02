package movie;

public class Movie {
    private String title;
    private int duration;
    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    public void getMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}
