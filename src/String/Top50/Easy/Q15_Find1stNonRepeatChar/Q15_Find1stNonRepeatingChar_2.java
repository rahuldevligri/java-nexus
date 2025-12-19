// Find the first non-repeating character in a string
package String.Top50.Easy.Q15_Find1stNonRepeatChar;

import java.util.Scanner;

public class Q15_Find1stNonRepeatingChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
