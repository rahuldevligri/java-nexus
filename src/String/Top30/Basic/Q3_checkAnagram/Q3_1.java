/*
3️⃣ Check if two Strings are Anagrams
👉 "listen", "silent"
⏱ Complexity
Time: O(n log n) ❗ (sorting involved)
Space: O(n)
 */
package String.Top30.Basic.Q3_checkAnagram;

import java.util.Arrays;

public class Q3_1 {
    private static boolean checkAnagrams(String a, String b){
        if (a.length() != b.length()) return false;

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
        System.out.println(Q3_1.checkAnagrams("listen", "silent"));
    }
}
