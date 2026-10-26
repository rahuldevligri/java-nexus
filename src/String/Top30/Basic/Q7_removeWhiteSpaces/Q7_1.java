/*
7️⃣ Remove White Spaces
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q7_removeWhiteSpaces;

public class Q7_1 {
    private static void removeWhiteSpaces(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isWhitespace(c)){ //(c != ' '){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        removeWhiteSpaces("  ra h ul ra dh a  ");
    }
}
