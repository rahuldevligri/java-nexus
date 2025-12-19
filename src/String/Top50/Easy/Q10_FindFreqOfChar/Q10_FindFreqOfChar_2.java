/* Find frequency of a given character in a string
 */
package String.Top50.Easy.Q10_FindFreqOfChar;
import java.util.Scanner;

public class Q10_FindFreqOfChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter character to find frequency: ");
        char target = sc.next().charAt(0);
        //Approach 2: Using Streams (Java 8+)
        long count = str.chars().filter(c -> c == target).count();
        System.out.println("Frequency: " + count);
    }
}
