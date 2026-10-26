/* 6️⃣ Reverse Words in a String
Input: "I love Java"
Output: "Java love I"
*/

package String.Top10;
public class Q6_ReverseWords {
    static String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1; i>=0;i--){
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str = "I love Java";
        System.out.println(reverseWords(str));
    }
}
