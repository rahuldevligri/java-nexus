/* 6️⃣ Count Occurrence of Each Character
👉 "aabbbcc" → a=2, b=3, c=2

⏱ Complexity
Time: O(n)
Space: O(1) ✅
 */
package String.Top30.Basic.Q6_CountOccurrence;

public class Q6_1 {
    private static void countOccurrence(String str){
        int[] occur = new int[26];
        for(int i=0;i<str.length();i++){
            occur[str.charAt(i) - 'a']++;
        }
        for(int i=0;i< occur.length;i++){
            if(occur[i] > 0){
                System.out.println((char)(i + 'a') + " --> " + occur[i]);
            }
        }
    }
    public static void main(String[] args) {
        countOccurrence("aabbbcc");
    }
}
