public class Student {
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
class ZSGSStudent extends Student{
    private int salary;
    private int incubationDuration;
    public ZSGSStudent(){
        
    }
    public ZSGSStudent(String name,int age,int salary,int incubationDuration){
        super(name, age);
        this.salary=salary;
        this.incubationDuration=incubationDuration;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setIncubationDuration(int incubationDuration){
        this.incubationDuration = incubationDuration;
    }
    public int getIncubationDuration(){
        return incubationDuration;
    }
}