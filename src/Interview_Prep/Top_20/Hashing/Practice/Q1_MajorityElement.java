package Interview_Prep.Top_20.Hashing.Practice;

import java.util.HashMap;

public class Q1_MajorityElement {
    public static void main(String[] args) {
        majorityElements(new int[]{1,3,2,5,1,3,1,5,1});
    }
    public static void majorityElements(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i < arr.length;i++){
                hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        for(int key : hm.keySet()){
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }
}
