//Print duplicate characters in a string?
/*
✔ Faster than HashMap
 */
package String.Top50.Easy.Q12_PrintDuplicateChar;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q12_printDuplicateChar_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for(char c : str.toCharArray()){
            if(!seen.add(c)){
                duplicates.add(c);
            }
        }
        duplicates.forEach(System.out::println);
    }
}
