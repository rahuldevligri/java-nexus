/* Check if a string contains only alphabets */
package String.Top50.Q20_CheckStringContainsOnlyAlphabets;
import java.util.Scanner;
public class Q20_CheckStringContainsOnlyAlphabets_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        boolean result = str.matches("[a-zA-Z]+");
        System.out.println("String contains only alphabets: "+ result);
    }
}
