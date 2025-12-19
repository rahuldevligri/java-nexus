/* Check if two strings are anagrams
"listen" , "silent" → true

⏱ Complexity
Time: O(n)
Space: O(1) (fixed-size array)
 */
package String.Top50.Medium.Q21_Check2StringsAnagrams;

import java.util.Scanner;

public class Q21_Check2StringsAnagrams_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
            return;
        }
        int[] freq = new int[256];
        //count char of str1
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)]++;
        }
        //subtract characters of str2
        for(int i=0;i<str2.length();i++){
            freq[str2.charAt(i)]--;
        }
        //check frequency array
        for(int i=0;i< freq.length;i++){
            if(freq[i] != 0){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
