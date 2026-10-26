/*
7️⃣ Remove White Spaces
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q7_removeWhiteSpaces;

public class Q7_2 {
    private static void removeWhiteSpaces(String str){
        String result = str.replaceAll("\\s", "");
        System.out.println(result);
    }
    public static void main(String[] args) {
        removeWhiteSpaces("  ra h ul ra dh a  ");
    }
}

