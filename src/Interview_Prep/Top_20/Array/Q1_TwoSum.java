package Interview_Prep.Top_20.Array;

import java.util.Arrays;
import java.util.HashMap;

public class Q1_TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = target - arr[i] ;
            if(hm.containsKey(key)){
                return new int[] {hm.get(key), i};
            }
            hm.put(arr[i], i);
        }
        return new int[] {};
    }
    //Time complexity: O(n)
    //Space Complexity: O(n)
}
