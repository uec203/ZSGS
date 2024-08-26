/*
 * 1. Write a Java program that creates an `ArrayList` of strings. Add five different fruits to the list, then retrieve and print the third fruit in the list.
 */
/**
 * Fruits
 */
import java.util.*;
public class Fruits {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        System.out.println(fruits.get(2));
    }
}