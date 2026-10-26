/* 8️⃣ Remove Duplicate Characters
⏱ Complexity
Time: O(n)
Space: O(1)
*/
package String.Top30.Basic.Q8_RemoveDuplicate;

public class Q8_2 {
    private static String removeDuplicate(String str){
        boolean[] visited = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if(!visited[c - 'a']) {
                visited[c - 'a'] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("radharahul"));
    }
}
