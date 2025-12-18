/* Count occurrences of each character in a string?
⏱ Complexity
Time: O(n)
Space: O(n)
*/
package String.Top50.Q14_CountOccurOfEachChar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q14_countOccurOfEachChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]!=0){
                System.out.println(str.charAt(i) + " -> " + freq[str.charAt(i)]);
                freq[str.charAt(i)] = 0;
            }
        }
    }
}
