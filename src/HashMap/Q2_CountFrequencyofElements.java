package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Q2_CountFrequencyofElements {
    static Map<Integer, Integer> frequency(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,4,3,4,3,2,1,5};
        Map<Integer, Integer> frequency = frequency(arr);
        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
