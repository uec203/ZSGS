package vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
        System.out.println("-----------------------------------------");
        v = new Car();
        v.start();
        v.stop();
    }
}
