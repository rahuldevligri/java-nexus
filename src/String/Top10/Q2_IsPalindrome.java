package String.Top10;

public class Q2_IsPalindrome {
    static boolean isPalindrome(String str){
        int start=0, end = str.length()-1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }
}
