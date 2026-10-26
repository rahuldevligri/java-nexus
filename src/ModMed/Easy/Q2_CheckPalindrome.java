package ModMed.Easy;

public class Q2_CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        approach_1(str);
        approach_2(str);
        approach_3(str);
        System.out.println(approach_4(str, 0, str.length() - 1));
    }

    //Brute Force Approach
    static void approach_1(String str){
        String rev = "";
        for(int i = str.length() - 1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    /* Using reverse += char creates a new String object every iteration because Strings are immutable.
       Time: O(n²)
       Space: O(n)
     */

    //Using two pointer approach ⭐ (Best Interview Solution)
    static void approach_2(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(arr[left] != arr[right]){
                System.out.println("Not Palindrome");
                break;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
    /* Two Pointers approach
    Time: O(n)
    Space: O(1)
     */

    // StringBuilder
    static void approach_3(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reverse));
    }
    /* String Builder
    Time: O(n)
    Space: O(n)
     */

    //Using Recursion
    static boolean approach_4(String str, int left, int right){
        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return approach_4(str, left+1, right-1);
    }
    /*
    Time: O(n)
    Space: O(n) (Recursion Stack)
     */
}
