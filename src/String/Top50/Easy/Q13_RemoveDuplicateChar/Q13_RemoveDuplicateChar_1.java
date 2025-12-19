/* Remove duplicate characters from a string?
⏱ Complexity
Time: O(n)
Space: O(n)
*/
package String.Top50.Easy.Q13_RemoveDuplicateChar;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q13_RemoveDuplicateChar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Set<Character> lhs = new LinkedHashSet<>();
        for(int i = 0; i<str.length();i++){
            lhs.add(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for (char ch : lhs) {
            result.append(ch);
        }
        System.out.println("After removing duplicates: " + result);
    }
}
