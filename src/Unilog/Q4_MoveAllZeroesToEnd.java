package Unilog;
import java.util.Arrays;
/* Move All Zeroes to the End
Problem: Move all zeroes to the end of an array while
maintaining the relative order of non-zero elements. */
public class Q4_MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int j = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/* Complexity
- Time: O(n) — one traversal.
- Auxiliary space: O(1) — no additional array is created.
 */
