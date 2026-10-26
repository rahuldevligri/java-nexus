/* 2️⃣ Check if String is Palindrome
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top30.Basic.Q2_checkPalindrome;

public class Q2_1_checkPalindrome {
    private static boolean checkPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(Q2_1_checkPalindrome.checkPalindrome(str));
    }
}
