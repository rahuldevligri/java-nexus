package Unilog;

public class Q2_findMinMax {
    public int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }
}
/*
Time and space complexity
- Time Complexity: O(n) — we traverse the array once.
- Auxiliary Space: O(1) — we use only two variables, min and max.
- Return space: O(1) extra space for a fixed-size result array.
*/

