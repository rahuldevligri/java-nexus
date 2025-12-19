/* Check if two strings are equal WITHOUT using equals()
⏱ Complexity
Time: O(n)
Space: O(1)
*/
package String.Top50.Easy.Q11_CheckTwoStringsEqualWithotEquals;
import java.util.Scanner;

public class Q11_CheckTwoStringsEqualWithotEquals_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();
        System.out.println(str1.compareTo(str2)==0);
    }
}
