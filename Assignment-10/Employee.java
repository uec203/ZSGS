public class Employee {
    private int employeeId;
    private String name;
    private String email;
    private String phoneNumber;
    private double salary;

    private static int employeeCount = 0;
    private static String companyName = "ABCD";
    public Employee(int employeeId, String name, String email, String phoneNumber, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        employeeCount++; 
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.print("Salary cannot be negative.");
        }
    }
    public static int getEmployeeCount() {
        return employeeCount;
    }
    public static String getCompanyName() {
        return companyName;
    }
    public void display(){
        System.out.println("Employee Details");
        System.out.println("EmployeeID : "+employeeId);
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Phone No : "+phoneNumber);
        System.out.println("Salary: "+salary);
    }
}
