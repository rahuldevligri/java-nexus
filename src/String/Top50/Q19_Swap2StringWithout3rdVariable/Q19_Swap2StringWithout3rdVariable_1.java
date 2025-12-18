/* Swap two strings WITHOUT using a third variable.
⏱ Complexity
Time: O(n)
Space: O(1) (no third variable)
->
*/
package String.Top50.Q19_Swap2StringWithout3rdVariable;
import java.util.Scanner;
public class Q19_Swap2StringWithout3rdVariable_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();

        //step1: concatenate
        str1+=str2; //javaphp
        //step2: Extract original str1 into str2
        str2 = str1.substring(0, str1.length() - str2.length());
        //step3: extract original str2 into str1
        str1 = str1.substring(str2.length());

        System.out.println("After swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
