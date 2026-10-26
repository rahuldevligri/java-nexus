package Array;

public class Q1_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        for(int a: arr){
            System.out.println(a);
        }
    }
}





















