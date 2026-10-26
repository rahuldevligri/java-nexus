/* Reverse a String
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q1_ReverseString;

class Q1_2_ReverseString {
    public static String ReverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        str = Q1_2_ReverseString.ReverseString(str);
        System.out.println(str);
    }
}

