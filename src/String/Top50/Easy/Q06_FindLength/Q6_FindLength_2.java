/* Q6 Find length of a string Without using length()?
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top50.Easy.Q06_FindLength;

import java.util.Scanner;

public class Q6_FindLength_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int count = 0;
        try {
            while(true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e){
            //end of string reached
        }
        System.out.println("String Length: " + count);
    }
}
