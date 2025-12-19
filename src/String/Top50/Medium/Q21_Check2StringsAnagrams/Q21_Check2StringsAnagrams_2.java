/* Check if two strings are anagrams
"listen" , "silent" → true

⏱ Complexity
Time: O(n log n)
 */
package String.Top50.Medium.Q21_Check2StringsAnagrams;
import java.util.Arrays;
import java.util.Scanner;

public class Q21_Check2StringsAnagrams_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("Anagram -> " + Arrays.equals(a, b));
    }
}
