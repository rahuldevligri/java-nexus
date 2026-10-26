package Interview_Prep.Top_20.SlidingWindow;

import java.util.*;


public class Q4_MaximumOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2,10,9,8,7}; // {5,2,4,3}; //{1,3,-1,-3,5,3,6,7};
        int size = arr.length;
        int k = 3;

        ArrayList<Integer> al = maximumOfAllSubarraysOfSizeK(arr, size, k);
        System.out.println(al);
    }

    private static ArrayList<Integer> maximumOfAllSubarraysOfSizeK(int[] arr, int size, int k) {
        int i=0,j=0;
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(Integer.MIN_VALUE);
        //8,9,10

        while(j < size){
            System.out.println("first: " + deque.getFirst() + " last: " + deque.getLast() +" deque: "+ deque);
            if(deque.getLast() < arr[j]){
                deque.remove();
                deque.push(arr[j]);
            } else{
                deque.push(arr[j]);
            }
            if((j-i)+1 < k) {
                j++;
            } else {
                result.add(deque.getLast());
                if(deque.getLast() == arr[i]){
                    deque.remove();
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
