package Interview_Prep.Top_20.Hashing.Practice;

import java.util.HashSet;

public class Q2_UnionOf2Array {
    public static void main(String[] args) {
        unionOf2Arrays(new int[] {7,3,9}, new int[]{6,3,9,2,9,4});

    }
    public static void unionOf2Arrays(int[] a1, int[] a2){
        HashSet<Integer> hs = new HashSet<>();

        for(int i: a1){
            hs.add(i);
        }
        for(int i : a2){
            hs.add(i);
        }
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
