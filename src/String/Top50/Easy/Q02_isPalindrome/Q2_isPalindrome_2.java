//Q2 check a string is palindrome or not?
/*
Complexity
Time: O(n)
Space: O(1)
 */
package String.Top50.Easy.Q02_isPalindrome;

import java.util.Scanner;

public class Q2_isPalindrome_2 {
    static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        System.out.println(isPalindrome(str));
    }
}
