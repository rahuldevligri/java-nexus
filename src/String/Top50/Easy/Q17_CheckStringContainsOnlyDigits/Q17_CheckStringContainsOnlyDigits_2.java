/* Check if a string contains only digits
 */
package String.Top50.Easy.Q17_CheckStringContainsOnlyDigits;
import java.util.Scanner;
public class Q17_CheckStringContainsOnlyDigits_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();
        boolean onlyDigits = true;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                onlyDigits = false;
                break;
            }
        }
        System.out.println(onlyDigits);
    }
}
