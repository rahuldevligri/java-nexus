package ModMed;

import java.util.Arrays;
import java.util.HashMap;

public class Q7_CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen".toLowerCase();
        String str2 = "silent".toLowerCase();

        //sort and compare
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        if(Arrays.equals(arr1,arr2)){
//            System.out.println("Anagram found");
//        } else {
//            System.out.println("Not Anagram");
//        }

        //using char count
//        if(str1.length() != str2.length()){
//            System.out.println("Lengths do not match");
//            return;
//        }
//
//        int[] count = new  int[26];
//
//        for(int i = 0; i<str1.length(); i++){
//            count[str1.charAt(i) - 'a']++;
//            count[str2.charAt(i) - 'a']--;
//        }
//        for(int num: count){
//            if(num != 0){
//                System.out.println("Not Anagram");
//                return;
//            }
//        }
//        System.out.println("Anagrams found");

        //Using HashMap

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        for(char ch : str2.toCharArray()){
            map.put(ch, map.get(ch)-1);
            if(map.get(ch)==0) map.remove(ch);
        }
        if(map.isEmpty()){
            System.out.println("Anagrams found");
        } else {
            System.out.println("Anagrams not found");
        }
    }
}
