/* Reverse each word in a sentence?
Input:  "Java is fun"
Output: "avaJ si nuf"

⏱ Time & Space Complexity
Time: O(n)
Space: O(n)
 */
package String.Top50.Easy.Q18_ReverseEachWordInSentence;
import java.util.Scanner;
public class Q18_ReverseEachWordInSentence_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                word.append(ch);
            } else {
                //reverse word and add to result.
                result.append(word.reverse());
                result.append(' ');
                word.setLength(0); //clear word...
            }
        }
        //reverse and add last word
        result.append(word.reverse());

        System.out.println(result);
    }
}
