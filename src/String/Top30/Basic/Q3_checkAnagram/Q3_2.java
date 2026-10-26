/*
3️⃣ Check if two Strings are Anagrams
👉 "listen", "silent"
⏱ Complexity
Time: O(n)
Space: O(1) (fixed size 26)
Best
 */
package String.Top30.Basic.Q3_checkAnagram;

public class Q3_2 {
    private static boolean checkAnagrams(String str1, String str2){
        if (str1.length() != str2.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for(int c : count){
            if( c != 0) return false;
        }
       return true;
    }
    public static void main(String[] args) {
        System.out.println(Q3_2.checkAnagrams("listen".toLowerCase(), "silent".toLowerCase()));
    }
}
