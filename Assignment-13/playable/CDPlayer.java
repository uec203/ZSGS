package playable;

public class CDPlayer implements Playable {
    public void play() {
        System.out.println("Playing CD...");
    }

    public void pause() {
        System.out.println("Pausing CD...");
    }

    public void stop() {
        System.out.println("Stopping CD...");
    }
}
