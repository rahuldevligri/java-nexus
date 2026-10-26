package Unilog;
/*
Question 2: Find the Second Largest Element
Problem: Given an integer array, find the second-largest
distinct element without sorting the array.
 */
public class Q3_secondLargest {
    public int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
/*
Time: \(O(n)\) — one traversal.
Auxiliary space: \(O(1)\) — only two variables.
 */