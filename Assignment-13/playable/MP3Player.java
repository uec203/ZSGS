package playable;

public class MP3Player implements Playable {
    public void play() {
        System.out.println("Playing MP3 file...");
    }

    public void pause() {
        System.out.println("Pausing MP3 file...");
    }

    public void stop() {
        System.out.println("Stopping MP3 file...");
    }
}
