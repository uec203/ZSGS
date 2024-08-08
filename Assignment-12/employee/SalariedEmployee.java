package employee;

public class SalariedEmployee extends Employee{
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }
    public double calculatePay() {
        return annualSalary / 12; 
    }
    public void getEmployeeDetails() {
        System.out.println("Employment Type: Salaried Employee");
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Monthly Pay: " + calculatePay());
    }
}
