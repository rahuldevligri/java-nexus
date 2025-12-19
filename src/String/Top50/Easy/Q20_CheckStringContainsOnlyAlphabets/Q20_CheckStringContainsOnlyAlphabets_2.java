/* Check if a string contains only alphabets
 */
package String.Top50.Easy.Q20_CheckStringContainsOnlyAlphabets;

import java.util.Scanner;

public class Q20_CheckStringContainsOnlyAlphabets_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        boolean result = !str.isEmpty();
        for(int i = 0;i<str.length();i++){
            if(!Character.isLetter(str.charAt(i))){
                result = false;
                break;
            }
        }
        System.out.println("String contains only alphabets: "+ result);
    }
}
