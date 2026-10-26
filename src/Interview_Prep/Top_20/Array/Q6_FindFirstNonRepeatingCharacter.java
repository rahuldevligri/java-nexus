package Interview_Prep.Top_20.Array;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q6_FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabbcdeff";
        findFirstNonRepeatingCharacter(s);
    }
    static void findFirstNonRepeatingCharacter(String str) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap();

        for (char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> i : hm.entrySet()) {
            if (i.getValue() == 1) {
                System.out.println(i.getKey());
                return;
            }
        }
        System.out.println("all are duplicated...");
    }
    //time complexity: O(n)
    //space complexity: O(n)
}
