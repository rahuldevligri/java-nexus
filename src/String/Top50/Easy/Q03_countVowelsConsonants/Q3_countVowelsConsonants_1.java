/* Count vowels and consonants in a string?
⏱ Time & Space Complexity
Time: O(n)
Space: O(1)
 */
package String.Top50.Easy.Q03_countVowelsConsonants;

import java.util.Scanner;

public class Q3_countVowelsConsonants_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        int vowels = 0, consonants = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}
