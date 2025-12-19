/* Remove all spaces from a string
 */
package String.Top50.Easy.Q08_RemoveAllSpaces;
import java.util.Scanner;
public class Q8_RemoveAllSpaces_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println(str.replace(" ",""));
    }
}