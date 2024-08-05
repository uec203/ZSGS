public class Vechicle {
    private String fuel;
    private int noOfSeats;
    public Vechicle(){

    }
    public Vechicle(String fuel,int noOfSeats){
        this.fuel = fuel;
        this.noOfSeats = noOfSeats;
    }
}
class Bike extends Vechicle{
    private String modelName;
    public Bike(String fuel,String modelName){
        super(fuel, 2);
        this.modelName=modelName;
    }

}
class Car extends Vechicle{
    private String modelName;
    public Car(String fuel,String modelName){
        super(fuel, 4);
        this.modelName=modelName;
    }
}