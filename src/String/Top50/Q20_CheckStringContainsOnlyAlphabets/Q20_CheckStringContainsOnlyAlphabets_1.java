/* Check if a string contains only alphabets
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top50.Q20_CheckStringContainsOnlyAlphabets;

import java.util.Scanner;

public class Q20_CheckStringContainsOnlyAlphabets_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        boolean result = true;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!(ch >='a' && ch <= 'z' || ch >='A' && ch <= 'Z')){
                result = false;
                break;
            }
        }
        System.out.println("String contains only alphabets: "+ result);
    }
}
