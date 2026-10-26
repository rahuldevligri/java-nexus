package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Q5_FindDuplicateElementsInArray {
    static void findDuplicates(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                System.out.println(e.getKey() + " -> " +e.getValue());
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        findDuplicates(arr);
    }
}
