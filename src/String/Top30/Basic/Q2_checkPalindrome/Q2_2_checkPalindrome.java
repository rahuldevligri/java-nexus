/* 2️⃣ Check if String is Palindrome
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top30.Basic.Q2_checkPalindrome;

public class Q2_2_checkPalindrome {
    private static boolean checkPalindrome(String str){
        //return str.equals(new StringBuilder(str).reverse().toString());
        return str.contentEquals(new StringBuilder(str).reverse());
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(Q2_2_checkPalindrome.checkPalindrome(str));
    }
}
