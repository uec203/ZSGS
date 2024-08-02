package employee;
public class Employee{
    private String name;
    private int id;
    public Employee(String name,int id){
        this.name = name ;
        this.id = id;
    }
    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}