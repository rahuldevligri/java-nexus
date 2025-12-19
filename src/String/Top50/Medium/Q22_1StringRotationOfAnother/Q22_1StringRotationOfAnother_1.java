/* Check if one string is a rotation of another
"abcd", "cdab" → true

⏱ Complexity
Time: O(n)
Space: O(n)
*/
package String.Top50.Medium.Q22_1StringRotationOfAnother;

import java.util.Scanner;

public class Q22_1StringRotationOfAnother_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.println("Not a rotation");
            return;
        }
        String combined = str1+str1;
        if(combined.contains(str2)){
            System.out.println("Rotation");
        } else {
            System.out.println("Not a rotation");
        }
    }
}
