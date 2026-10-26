/* Given an array and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.
Example:
Input: arr[12 -1 -7 8 -15 30 16 28], k=3
Output:-1 -1 -7 -15 -15 0...

 */
package Interview_Prep.Top_20.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3; //window
        int i=0,j=0;
        List<Integer> answer = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        while(j < arr.length){
            if(arr[j] < 0){
                negatives.add(arr[j]);
            }
            if((j-i)+1 < k){
                j++;
            }else if((j-i)+1 == k){
                if(negatives.isEmpty()){
                    answer.add(0);
                } else{
                    answer.add(negatives.get(0));
                }

                if(!negatives.isEmpty() && arr[i] == negatives.get(0)) {
                    negatives.remove(0);
                }
                i++;
                j++;
            }
        }
        System.out.println(answer);
    }
}
