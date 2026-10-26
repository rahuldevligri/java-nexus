/* 2️⃣ Check if String is Palindrome? Ignore spaces, cases, special characters
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top30.Basic.Q2_checkPalindrome;

public class Q2_3_checkPalindrome {
    private static boolean checkPalindrome(String str){
        int end = str.length()-1, start = 0;
        while(start < end){
            while(start < end && !Character.isLetterOrDigit(str.charAt(start++))){
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(str.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(str.charAt(start)) !=
                    Character.toLowerCase(str.charAt(end)))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(Q2_3_checkPalindrome.checkPalindrome(str));
    }
}

