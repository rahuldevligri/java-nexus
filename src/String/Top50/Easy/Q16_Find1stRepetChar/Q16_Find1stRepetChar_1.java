/* Find the FIRST REPEATING character in a string
⏱ Complexity (BEST POSSIBLE)
Time Complexity: O(n)
Space Complexity: O(1) (fixed-size array)
 */
package String.Top50.Easy.Q16_Find1stRepetChar;
import java.util.Scanner;

public class Q16_Find1stRepetChar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for(int i = 0;i<str.length();i++)
            freq[str.charAt(i)]++;
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > 1) {
                System.out.println(str.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No repeating character found");
        }
    }
}
