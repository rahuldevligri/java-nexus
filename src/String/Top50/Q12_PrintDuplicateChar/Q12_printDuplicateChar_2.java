//Print duplicate characters in a string?
/*
✔ Faster than HashMap
 */
package String.Top50.Q12_PrintDuplicateChar;
import java.util.Scanner;

public class Q12_printDuplicateChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        int[] duplicate = new int[256];
        for(int i = 0; i < str1.length(); i++){
            duplicate[str1.charAt(i)]++;
        }
        for(int i = 0 ; i < str1.length(); i++){
            if(duplicate[str1.charAt(i)] > 1){
                System.out.println(str1.charAt(i));
                duplicate[str1.charAt(i)] = 0;
            }
        }
    }
}
