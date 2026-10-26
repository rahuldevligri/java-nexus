package Interview_Prep.Top_20.Array;

import java.util.HashSet;

public class Q4_FindDuplicateElements {
    public static void main(String[] args) {
        HashSet<Integer> duplicateElements = findDuplicateElements(new int[]{1, 2, 3, 2,4, 5, 1});
        System.out.println(duplicateElements);
    }
    static HashSet<Integer> findDuplicateElements(int[] arr){
        HashSet<Integer> visited =  new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int i : arr){
            if(visited.contains(i)){
                duplicates.add(i);
            }
            visited.add(i);
        }
        return duplicates;
    }//time complexity: O(n)
    //space complexity: O(n)
}
