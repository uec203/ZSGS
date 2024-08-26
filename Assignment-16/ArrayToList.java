import java.util.*;
/*
 * 4. Write a Java program that initializes an `ArrayList` of strings with the values {"apple", "banana", "cherry"}. Convert the `ArrayList` to an array, print the array, then convert the array back to an `ArrayList` and print the `ArrayList`.
 */
public class ArrayToList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        String[] arr = list.toArray(new String[0]);
        list = new ArrayList<>(Arrays.asList(arr));
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
