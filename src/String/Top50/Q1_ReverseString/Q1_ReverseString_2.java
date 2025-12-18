//Q1. reverse a Stirng.

package String.Top50.Q1_ReverseString;

import java.util.Scanner;

public class Q1_ReverseString_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int start = 0, end = str.length()-1;
        while(start < end){
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        System.out.println(str + " <-Reverse-> " + new String(arr));
    }
}
