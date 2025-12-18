//Reverse a string
package String.Top50.Q1_ReverseString;

import java.util.Scanner;

public class Q1_ReverseString_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        StringBuilder revStr = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){
            revStr.append(str.charAt(i));
        }
        System.out.println(str + " <-Reverse-> " + revStr);
    }
}
/*
⏱ Time & Space Complexity

Time Complexity: O(n)
(Loop runs once for each character)

Space Complexity: O(n)
(New reversed string is created)
*/