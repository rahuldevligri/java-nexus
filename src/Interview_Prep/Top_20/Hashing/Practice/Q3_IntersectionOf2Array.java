package Interview_Prep.Top_20.Hashing.Practice;

import java.util.HashSet;

public class Q3_IntersectionOf2Array {
    public static void main(String[] args) {
        intersectionOf2Arrays(new int[] {7,3,9}, new int[]{6,3,9,2,9,4});

    }
    public static void intersectionOf2Arrays(int[] a1, int[] a2){
        HashSet<Integer> hs = new HashSet<>();
        int count=0;

        for(int i: a1){
            hs.add(i);
        }

        for(int i : a2){
            if(hs.contains(i)){
                hs.remove(i);
                count++;
            }
        }
        System.out.println(hs);
        System.out.println(count);
    }
}
