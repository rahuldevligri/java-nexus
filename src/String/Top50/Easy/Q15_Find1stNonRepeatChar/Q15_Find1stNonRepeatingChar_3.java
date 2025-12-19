/* Find the first non-repeating character in a string
⏱ Complexity (Be Honest in Interview)
Time: O(n²)
Space: O(1)
*/
package String.Top50.Easy.Q15_Find1stNonRepeatChar;

import java.util.OptionalInt;
import java.util.Scanner;

public class Q15_Find1stNonRepeatingChar_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        OptionalInt first = str.chars().filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst();
        if (first.isPresent()) System.out.println((char) first.getAsInt());
        else System.out.println("No non-repeating character found");
    }
}
