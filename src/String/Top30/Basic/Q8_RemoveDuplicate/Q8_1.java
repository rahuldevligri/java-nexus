/* 8️⃣ Remove Duplicate Characters
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q8_RemoveDuplicate;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q8_1 {
    private static String removeDuplicate(String str){
        Set<Character> lhs = new LinkedHashSet<>();
        for(char c : str.toCharArray()){
            lhs.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : lhs){
                sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("radharahul"));
    }
}
