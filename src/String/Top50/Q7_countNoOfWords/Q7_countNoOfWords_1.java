/* count no of words in a string?
⏱ Complexity
Time: O(n)
Space: O(1) ⭐ (Best)
 */
package String.Top50.Q7_countNoOfWords;

import java.util.Scanner;

public class Q7_countNoOfWords_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        System.out.println("Word Count: " + count);
    }
}
