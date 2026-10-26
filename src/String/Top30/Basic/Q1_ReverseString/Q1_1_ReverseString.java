/* Reverse a String
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q1_ReverseString;

class Q1_1_ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        str = sb.toString();
        System.out.println(str);
    }
}
