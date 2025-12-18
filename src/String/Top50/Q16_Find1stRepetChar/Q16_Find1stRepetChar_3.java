/* Find the FIRST REPEATING character in a string
 */
package String.Top50.Q16_Find1stRepetChar;
import java.util.*;

public class Q16_Find1stRepetChar_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Set<Character> seen = new HashSet<>();
        for(char c : str.toCharArray()) {
            if (!seen.add(c)) {
                System.out.println(c);
                break;
            }
        }
    }
}