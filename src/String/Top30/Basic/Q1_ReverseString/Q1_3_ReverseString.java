/* Reverse a String
⏱ Complexity
Time: O(n)
Space: O(1) (best)
 */
package String.Top30.Basic.Q1_ReverseString;

class Q1_3_ReverseString {
    public static String ReverseString(String str){
        char[] ch = str.toCharArray();
        int start = 0, end = ch.length-1;
        while(start < end){
            char temp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = temp;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "hello";
        str = Q1_3_ReverseString.ReverseString(str);
        System.out.println(str);
    }
}
