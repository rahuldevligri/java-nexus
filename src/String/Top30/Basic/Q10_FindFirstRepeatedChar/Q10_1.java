/* 🔟 Find First Repeated Character
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q10_FindFirstRepeatedChar;

import java.util.HashSet;
import java.util.Set;

public class Q10_1 {
    private static char findFirstRepeatedChar(String str){
        Set<Character> set = new HashSet<>();
        for(char c: str.toCharArray()){
           if(set.contains(c)) return c;

           set.add(c);
        }
        return '_';
    }
    public static void main(String[] args) {
        System.out.println(findFirstRepeatedChar("radha"));
    }
}
