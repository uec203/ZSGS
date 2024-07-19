/*
 * 3. Create a Main class with a main method to test the Person class by creating objects using each constructor and printing their details.
 */
public class Main {
    static void printDetails(Person p){
        System.out.println("Name: "+p.name);
        if(p.age!=0) System.out.println("Age: "+p.age);
        if(p.Address!=null) System.out.println("Address: "+p.Address);

    }
    public static void main(String[] args) {
        Person p1 = new Person("Jackie");
        Person p2 = new Person("John",21);
        Person p3 = new Person("Robert",61,"No:132, My Street, Kingston, New York 12401, United States");
        printDetails(p1);
        printDetails(p2);
        printDetails(p3);
    }
}
