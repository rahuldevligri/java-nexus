package Interview_Prep.Top_20.Array;

import java.util.Arrays;

public class Q2_TwoSumSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3, 4, 7, 11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumSortedArray(arr, target)));
    }

    static int[] twoSumSortedArray(int[] arr, int target){
        int i=0;
        int j = arr.length-1;

        while(i < j){
            if(arr[i] + arr[j] == target){
                return new int[]{i,j};
            } else if(arr[i] + arr[j] > target){
                j--;
            } else {
                i++;
            }
        }
        return new int[] {};
    }
    //time complexity: O(n)
    //space complexity: O(1)
}
