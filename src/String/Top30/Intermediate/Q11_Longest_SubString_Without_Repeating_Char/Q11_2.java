/* 1️⃣1️⃣ Longest Substring Without Repeating Characters
👉 Sliding Window (🔥 VERY IMPORTANT)
⏱ Complexity
Time: O(n) ✅
Space: O(n)
 */
package String.Top30.Intermediate.Q11_Longest_SubString_Without_Repeating_Char;

import java.util.HashMap;
import java.util.Map;

public class Q11_2 {
    private static int longestSubstringWithoutRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, maxLength = 0;
        for(int end=0;end<str.length();end++){
            char current = str.charAt(end);
            if(map.containsKey(current)){
                start = Math.max(start, map.get(current)+1);
                System.out.println(map.get(current) + " __ "+ start);
            }
            map.put(current, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println(map +" --> " + maxLength);
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeatingChar("abcabcbb"));
    }
}
