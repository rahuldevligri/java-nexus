package ModMed.Easy;

import java.util.Arrays;

public class Q1_ReverseString {
    public static void main(String[] args) {
        String s = "Hello World";
        Approach_1(s);
        Approach_2(s);
        Approach_3(s);
        System.out.println(Approach_4(s));
    }

    //Brute_force_approach
    public static void Approach_1(String str){
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
    /* Brute_force_approach
    Time: O(n²)
    Space: O(n)
     */

    //Using StringBuilder
    public static void Approach_2(String str){
        StringBuilder sb = new StringBuilder();
        String rev = sb.append(str).reverse().toString();
        System.out.println(rev);
    }
    /* Using StringBuilder
    Time: O(n)
    Space: O(n)
    */

    //Character Array + Two Pointers Approach ⭐ (Best Interview Solution)
    public static void Approach_3(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String rev = new String(arr);
        System.out.println(rev);
    }
    /* Character Array + Two Pointers
    Time: O(n)
    Space: O(n) (for the character array)
     */

    // Recursion Approach
    public static String Approach_4(String str){
        if (str.isEmpty())
            return str;
        return Approach_4(str.substring(1)) + str.charAt(0);
    }
    /* Recursion Approach
    Time: O(n²) (because substring() creates new strings)
    Space: O(n) (recursion stack)
     */
}
