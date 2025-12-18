/* Q6 Find length of a string Without using length()?
⏱ Complexity
Time: O(n)
Space: O(n) (because of toCharArray())
 */
package String.Top50.Q6_FindLength;

import java.util.Scanner;

public class Q6_FindLength_3 {
    private static int findLength(String str){
        if(str.isEmpty()){
            return 0;
        }
        return 1 + findLength(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("String Length: " + findLength(str));
    }
}