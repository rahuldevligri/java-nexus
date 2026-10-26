/* 1️⃣1️⃣ Longest Substring Without Repeating Characters
👉 Sliding Window (🔥 VERY IMPORTANT)
⏱ Complexity
Time: O(n) ✅
Space: O(n)
 */
package String.Top30.Intermediate.Q11_Longest_SubString_Without_Repeating_Char;

import java.util.HashSet;
import java.util.Set;

public class Q11_1 {
    private static int longestSubstringWithoutRepeatingChar(String str){
        Set<Character> set = new HashSet<>();
        int start = 0, maxLength = 0;
        for(int i = 0; i < str.length(); i++){
            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(start++));
            }
            set.add(str.charAt(i));
            maxLength = Math.max(maxLength, i - start + 1);
        }
        System.out.println(set +" --> " + maxLength);
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeatingChar("abcabcbb"));
    }
}
