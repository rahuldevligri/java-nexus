package Interview_Prep.Top_20.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static java.util.Arrays.sort;

public class Q12_GroupOfAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupOfAnagrams(arr));
    }
    static List<List<String>> groupOfAnagrams(String[] arr){
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String word : arr){
            //convert word into array
            char[] ch = word.toCharArray();

            //Arrays.sort
            sort(ch);

            //create key
            String key = new String(ch);

            //if not exist add
            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<>());
            }
            //add
            hm.get(key).add(word);
        }
        return new ArrayList<>(hm.values());
    }
    /* Time Complexity = O(n × k log k)
        Space Complexity = O(n × k)
     */
}
