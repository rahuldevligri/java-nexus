/* Check if two strings are equal WITHOUT using equals()
⏱ Complexity
Time: O(n)
Space: O(1)
*/
package String.Top50.Easy.Q11_CheckTwoStringsEqualWithotEquals;

import java.util.Scanner;

public class Q11_CheckTwoStringsEqualWithotEquals_1 {
    private static boolean checkStringsEqualOrNot(String str1, String str2){
        // Step 1: Length check
        if (str1.length() != str2.length()) {
            return false;
        }
        // Step 2: Character-by-character comparison
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String str2 = sc.nextLine();
        System.out.println(checkStringsEqualOrNot(str1, str2));
    }
}
