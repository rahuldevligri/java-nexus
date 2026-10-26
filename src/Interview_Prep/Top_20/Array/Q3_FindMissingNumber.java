package Interview_Prep.Top_20.Array;

public class Q3_FindMissingNumber {
    public static void main(String[] args) {
//        int[] arr = {9,6,4,2,3,5,7,0,1};
        int[] arr = {6, 4, 2, 3, 5, 8, 0, 1};
        System.out.println(xorApproach(arr));
//        System.out.println(findMissingNumber(arr));
    }

    static int findMissingNumber(int[] arr) {
        int actualSum = 0;
        int sum = 0;
        int n = arr.length;

        for(int i : arr){
            sum += i;
        }
        actualSum = n*(n+1)/2;
        return actualSum - sum;
    }
    //time complexity: O(n)
    //space complexity: O(1)

    // XOR Approach
    static int xorApproach(int[] arr) {

        int xor1 = 0;
        int xor2 = 0;

        // XOR all indices (0 to n-1) and all array elements
        for (int i = 0; i < arr.length; i++) {
            xor1 ^= i;
            xor2 ^= arr[i];
        }

        // XOR with n (arr.length) because the range is 0 to n
        xor1 ^= arr.length;

        return xor1 ^ xor2;
    }
    //time complexity: O(n)
    //space complexity: O(1)
}
