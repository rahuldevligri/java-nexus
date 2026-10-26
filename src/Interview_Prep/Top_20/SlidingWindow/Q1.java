/* Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.
Example:
Input: size = 7, K = 3 & Arr = [2,5,1,8,2,9,1]
Output:19
Explanation: Arr[3] + Arr[4] + Arr[5] = 19, which is maximum... */

package Interview_Prep.Top_20.SlidingWindow;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int size = 7;
        int k = 3; //window
        int sum,i,j;
        int max = Integer.MIN_VALUE;
        sum = i = j = 0;

        while(j<size){
            sum += arr[j];
            if((j-i)+1 < k){
                j++;
            } else if((j-i)+1 == k){
                max = Math.max(max, sum);
                sum -= arr[i];
                j++;
                i++;
            }
        }
        System.out.println(max);
    }
}
