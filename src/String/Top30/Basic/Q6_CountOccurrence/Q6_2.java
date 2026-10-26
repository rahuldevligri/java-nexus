/* 6️⃣ Count Occurrence of Each Character
👉 "aabbbcc" → a=2, b=3, c=2

⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q6_CountOccurrence;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q6_2 {
    private static void countOccurrence(String str){
        Map<Character, Integer> map = new LinkedHashMap<>(); //maintain insertion order
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        map.forEach((k, v) -> System.out.println(k + " --> " + v));
    }
    public static void main(String[] args) {
        countOccurrence("aabbbcc");
    }
}
