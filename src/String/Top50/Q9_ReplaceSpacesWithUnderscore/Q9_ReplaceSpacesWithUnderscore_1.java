/* Replace spaces with underscore _
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top50.Q9_ReplaceSpacesWithUnderscore;

import java.util.Scanner;

public class Q9_ReplaceSpacesWithUnderscore_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder sbt = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            sbt.append(str.charAt(i) == ' ' ? '_' : str.charAt(i));
        }
        System.out.println(sbt);

        //logice 2
        System.out.println(str.replaceAll("\\s","_"));
    }
}
