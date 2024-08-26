import java.util.*;
/*
 * 3. Write a Java program that creates an `ArrayList` of characters. Add ten different characters to the list. Write a method that takes a character as an argument and returns the index of the character in the list. If the character is not found, return -1.
 */
public class TenCharacter {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();

        // Add ten different characters to the list
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');
        characters.add('G');
        characters.add('H');
        characters.add('I');
        characters.add('J');
        char find = 'N';
        if(characters.contains(find)){
            System.out.println(characters.indexOf(find));
        }
        else{
            System.out.println(-1);
        }

    }
}
