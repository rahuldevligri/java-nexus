//Check if One String Is Rotation of Another?
/*
Input: s = "abcde", goal = "cdeab"
Output: true
 */
package String.Top10;

public class Q7_1stringIsRotationOfAnother {
    static boolean isRotation(String s, String goal){
        if(s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abced";
        System.out.println(isRotation(s1, s2));
    }
}
