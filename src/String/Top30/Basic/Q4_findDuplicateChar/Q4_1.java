/*
4️⃣ Find Duplicate Characters in a String
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q4_findDuplicateChar;

import java.util.HashMap;
import java.util.Map;

public class Q4_1 {
    private static Map<Character, Integer> findDuplicate(String str){
        str = str.toLowerCase().replaceAll("\\s", "");
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> m : map.entrySet()){
            if (m.getValue() > 1)
                System.out.println(m.getKey() + " --> " + m.getValue());
        }

        //or

        map.forEach((k,v) -> {
            if(v > 1) System.out.println(k + " --> " + v);
        });

        //or

        map.entrySet().removeIf(entry -> entry.getValue() <= 1);
        return map;
    }
    public static void main(String[] args) {
        Map<Character, Integer> map = Q4_1.findDuplicate("rahulradha");
        map.forEach((k, v) -> System.out.println(k + " --> " + v));
    }
}
