/* Reverse each word in a sentence?
Input:  "Java is fun"
Output: "avaJ si nuf"
 */
package String.Top50.Easy.Q18_ReverseEachWordInSentence;
import java.util.Scanner;
public class Q18_ReverseEachWordInSentence_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String w : words)
            result.append(new StringBuilder(w).reverse()).append(" ");
        System.out.println(result);
    }
}
