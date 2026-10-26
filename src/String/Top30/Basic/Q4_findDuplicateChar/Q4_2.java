/*
4️⃣ Find Duplicate Characters in a String
⏱ Complexity
Time: O(n)
Space: O(1) best
 */
package String.Top30.Basic.Q4_findDuplicateChar;

import java.util.HashMap;
import java.util.Map;

public class Q4_2 {
    private static void findDuplicate(String str){
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                System.out.println((char)(i+'a') + " --> "+ freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        Q4_2.findDuplicate("rahulradha");
    }
}
