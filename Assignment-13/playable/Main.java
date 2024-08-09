package playable;

public class Main {
    public static void main(String[] args) {
        Playable Player = new MP3Player();
        System.out.println("MP3 Player Controls:");
        Player.play();
        Player.pause();
        Player.stop();

        Player = new CDPlayer();
        System.out.println("\nCD Player Controls:");
        Player.play();
        Player.pause();
        Player.stop();
        
        Player = new StreamingPlayer();
        System.out.println("\nStreaming Player Controls:");
        Player.play();
        Player.pause();
        Player.stop();
    }
}
