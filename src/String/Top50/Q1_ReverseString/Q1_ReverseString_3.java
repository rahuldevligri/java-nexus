//Q1. reverse a Stirng.

package String.Top50.Q1_ReverseString;

import java.util.Scanner;

public class Q1_ReverseString_3 {
    static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String reverse = reverse(str);
        System.out.println(str + " <-Reverse-> " + reverse);
    }
}
/*
Time Complexity
O(n²)

Why?
substring() creates a new string each time → O(n)
Called n times

Space Complexity
O(n)
Recursive call stack
 */