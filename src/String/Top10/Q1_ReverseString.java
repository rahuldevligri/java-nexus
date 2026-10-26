package String.Top10;

public class Q1_ReverseString {
    static String reverseString(String str){
        char[] arr = str.toCharArray();
        int start=0, end = arr.length-1;
        while(start < end){
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));
    }
}
