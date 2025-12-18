/* count no of words in a string?
 */
package String.Top50.Q7_countNoOfWords;

import java.util.Scanner;

public class Q7_countNoOfWords_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");
        System.out.println("Word Count: " + words.length);
    }
}
