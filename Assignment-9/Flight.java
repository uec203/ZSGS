/*
 * 3. Create Flight DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers.
 */
public class Flight {
    private String flightNumber;
    private int noOfSeats;
    private String departureCity;
    private String arrivalCity;
    private double price;

    private static int flightCount = 0;

    public Flight(String flightNumber,int noOfSeats,String departureCity, String arrivalCity, double price) {
        this.flightNumber = flightNumber;
        this.noOfSeats = noOfSeats;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.price = price;
        flightCount++; 
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    public String getDepartureCity() {
        return departureCity;
    }
    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }
    public String getArrivalCity() {
        return arrivalCity;
    }
    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }
    public static int getFlightCount() {
        return flightCount;
    }
}
