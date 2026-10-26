/* 8️⃣ Remove Duplicate Characters from String */
package String.Top10;

public class Q8_RemoveDuplicateCharFromString {
    static String removeDuplicates(String s){
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!seen[ch]){
                seen[ch] = true;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "radharaman";
        System.out.println(removeDuplicates(s));
    }
}
