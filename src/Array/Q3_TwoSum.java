package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Q3_TwoSum {
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int []{};
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6};
        int target = 11;
        System.out.println(Arrays.toString(twoSumBruteForce(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[] {hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
