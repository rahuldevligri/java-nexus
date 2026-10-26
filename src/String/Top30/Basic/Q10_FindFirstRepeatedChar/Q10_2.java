/* 🔟 Find First Repeated Character
⏱ Complexity
Time: O(n)
Space: O(1) best
 */
package String.Top30.Basic.Q10_FindFirstRepeatedChar;

public class Q10_2 {
    private static char findFirstRepeatedChar(String str){
        boolean[] seen = new boolean[26];
        for(char c : str.toCharArray()){
            if(seen[c - 'a']) return c;

            seen[c - 'a'] = true;
        }
        return '_';
    }
    public static void main(String[] args) {
        System.out.println(findFirstRepeatedChar("radha"));
    }
}
