/* Replace spaces with underscore _
 */
package String.Top50.Easy.Q09_ReplaceSpacesWithUnderscore;

import java.util.Scanner;

public class Q9_ReplaceSpacesWithUnderscore_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println(str.replaceAll("\\s","_"));
    }
}
