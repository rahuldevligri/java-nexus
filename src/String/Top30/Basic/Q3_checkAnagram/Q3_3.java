/*
3️⃣ Check if two Strings are Anagrams
👉 "listen", "silent"
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q3_checkAnagram;

import java.util.HashMap;

public class Q3_3 {
    private static boolean checkAnagrams(String str1, String str2){
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> hm = new HashMap<>();

        for(char c: str1.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        for(char c: str2.toCharArray()){
            if(!hm.containsKey(c)) return false;

            hm.put(c, hm.get(c) - 1);
            if(hm.get(c) == 0) hm.remove(c);
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(Q3_3.checkAnagrams("listen".toLowerCase(), "silent".toLowerCase()));
    }
}
