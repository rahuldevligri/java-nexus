/* Find frequency of a given character in a string
⏱ Complexity
Time: O(n)
Space: O(1) ⭐
 */
package String.Top50.Easy.Q10_FindFreqOfChar;
import java.util.Scanner;

public class Q10_FindFreqOfChar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter character to find frequency: ");
        char target = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == target) count++;
        System.out.println("Frequency: " + count);
    }
}
