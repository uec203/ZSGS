package employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new HourlyEmployee("John", 0, 20, 40);
        e.getEmployeeDetails();
        System.out.println("-----------------------------------------");
        e = new SalariedEmployee("Jack", 1, 120000);
        e.getEmployeeDetails();
    }
}
