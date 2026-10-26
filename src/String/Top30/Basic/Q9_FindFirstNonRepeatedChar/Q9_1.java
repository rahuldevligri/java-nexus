/* 9️⃣ Find First Non-Repeated Character
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top30.Basic.Q9_FindFirstNonRepeatedChar;

public class Q9_1 {
    private static void findFirstNonRepeatedChar(String str){
        int[] freq = new int[26];
        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : str.toCharArray()){
            if(freq[c - 'a'] == 1){
                System.out.println(c);
                break;
            }
        }
    }

    public static void main(String[] args) {
        findFirstNonRepeatedChar("radharahul");
    }
}
