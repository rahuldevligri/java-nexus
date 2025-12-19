/* Check if a string contains only digits
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top50.Easy.Q17_CheckStringContainsOnlyDigits;
import java.util.Scanner;
public class Q17_CheckStringContainsOnlyDigits_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();
        boolean onlyDigits = true;
        if(str.isEmpty()){
            onlyDigits = false;
        } else {
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch < '0' || ch > '9'){
                    onlyDigits = false;
                    break;
                }
            }
        }
        System.out.println(onlyDigits);
    }
}
