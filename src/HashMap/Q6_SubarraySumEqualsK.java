// Question: Count number of subarrays whose sum equals K.
package HashMap;

import java.util.HashMap;
import java.util.Map;
/*
k= 9
map= 0->1, 1->1, 3->1, 7->1, 12->1, 9->1, 26->1
sum = 0,1,3,7,12,18,26
count = 0,1
num = 1,2,4,5,6,7
 */

public class Q6_SubarraySumEqualsK {
    static int subarraySum(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for(int num : nums){
            sum+= num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            System.out.println("sum-> "+sum);
            System.out.println("count-> "+count);
        }
        System.out.println(map);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};
        int k = 9;
        System.out.println(subarraySum(arr, k));
    }
}
