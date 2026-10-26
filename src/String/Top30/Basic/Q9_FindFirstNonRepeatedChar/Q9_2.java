/* 9️⃣ Find First Non-Repeated Character
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q9_FindFirstNonRepeatedChar;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q9_2 {
    private static char findFirstNonRepeatedChar(String str){
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            lhm.put(c, lhm.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : lhm.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("radharahul"));
    }
}
