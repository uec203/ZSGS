package movie;

public class Main {
    public static void main(String[] args) {
        Movie m = new RomComMovie("Remo", 135, "RomCom");
        m.getMovieDetails();
        System.out.println("-----------------------------------------");
        m = new ThrillerMovie("Inception", 140, "Thriller");
        m.getMovieDetails();
    }
}
