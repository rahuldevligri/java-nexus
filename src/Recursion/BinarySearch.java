//arr= [1,23,4,5,6,7,45], targer = 45
package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 66, 78};
        int target = 2;
        int start = 0, end = arr.length-1;
        System.out.println(target + " -> " + binarySearch(arr, target, start, end));
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return binarySearch(arr, target, start, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, end);
    }
}
