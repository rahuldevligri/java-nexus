//Q2 check a string is palindrome or not?
package String.Top50.Q2_isPalindrome;

import java.util.Scanner;

public class Q2_isPalindrome_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().replaceAll("\\s+", "").toLowerCase(); //madam

        System.out.print(str + " is Palindrome: "+ str.equals(reverse(str)));
    }
    private static String reverse(String str) {
        if(str.isEmpty())
            return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

