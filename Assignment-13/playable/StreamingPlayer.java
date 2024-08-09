package playable;

public class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming audio...");
    }

    public void pause() {
        System.out.println("Pausing stream...");
    }

    public void stop() {
        System.out.println("Stopping stream...");
    }
}