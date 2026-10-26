package Array;

public class Q2_FindMinMax {
    public static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println(min + "<- getMin & max -> " + max);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,34,65};
        findMinMax(arr);
    }
}
