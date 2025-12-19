//Q2 check a string is palindrome or not?
/*
⏱ Complexity
Time: O(n²)
Space: O(n)
*/
package String.Top50.Easy.Q02_isPalindrome;

import java.util.Scanner;

public class Q2_isPalindrome_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        StringBuilder rev = new StringBuilder();

        for(int i = str.length()-1;i>=0; i--)
            rev.append(str.charAt(i));

        System.out.print(str.contentEquals(rev));
    }
}
