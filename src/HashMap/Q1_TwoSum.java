package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1_TwoSum {
    static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need = target-nums[i];
            if(hm.containsKey(need)){
                return new int[] {hm.get(need), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,12};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
