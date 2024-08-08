package employee;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double hoursWorked;
    public HourlyEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
    public void getEmployeeDetails() {
        System.out.println("Employment Type: Hourly Employee");
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: " + calculatePay());
    }
}
