/*
 * 2. Create a Java program that initializes an `ArrayList` of integers with the values {10, 20, 30, 40, 50}. Use an iterator to iterate through the list and remove all elements greater than 30. Print the modified list.
 */
import java.util.*;

public class GreaterThan30 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        ListIterator list = a.listIterator();
        while (list.hasNext()) {
            if(((int)list.next())>30){
                list.remove();
            }
        }
        // for(Integer list : a){
        //     a.remove(list);
        // }
        System.out.println(a);
    }
}
