/* Remove all spaces from a string
Complexity
Time: O(n)
Space: O(n)
 */
package String.Top50.Q8_RemoveAllSpaces;
import java.util.Scanner;
public class Q8_RemoveAllSpaces_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder sbt = new StringBuilder();
        for(char s : str.toCharArray()) if(s != ' ') sbt.append(s);
        System.out.println(sbt);
    }
}
