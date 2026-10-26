package Array;

import java.util.Arrays;

public class Q4_MoveZerosToEnd {
    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) nums[index++] = num;
        }
        while (index < nums.length) nums[index++] = 0;
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,4,5};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

}
