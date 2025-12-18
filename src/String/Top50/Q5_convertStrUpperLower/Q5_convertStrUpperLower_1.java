//Convert string to uppercase/lowercase WITHOUT using built-in methods
/*
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top50.Q5_convertStrUpperLower;

import java.util.Scanner;

public class Q5_convertStrUpperLower_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //converts to Uppercase
            if(ch >= 'a' && ch <= 'z'){
                upper.append((char) (ch-32));
            } else {
                upper.append(ch);
            }
            //converts to lowercase
            if(ch >= 'A' && ch <= 'Z'){
                lower.append((char)(ch + 32));
            } else {
                lower.append(ch);
            }
        }
        System.out.println("Uppercase " + upper);
        System.out.println("Lowercase " + lower);
    }
}
