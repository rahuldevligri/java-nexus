/* Group Anagrams
Given an array of strings, Approach2 the strings that are anagrams of each other and return the grouped result.
Two strings are anagrams if they contain the same characters with the same frequency but in a different order.
Input: ["eat", "cat", "bat", "tab", "ate", "tea", "jump", "pump", "silent", "listen"]
Output: [["eat", "ate", "tea"], ["cat"], ["bat", "tab"], ["jump"], ["pump"], ["silent", "listen"]]
 */
package String;
import java.util.*;
public class Q6_GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "cat", "bat", "tab", "ate", "tea", "jump", "pump", "silent", "listen"};
        Map<String, List<String>> map = new HashMap<>(); // key: ["value1", "value2", "...."];

        for(String word : words){ // eat
            char[] arr = word.toCharArray(); // ['e', 'a', 't']
            Arrays.sort(arr);// ['a','e','t']
            String key = new String(arr);//key = "aet"
            if(!map.containsKey(key)){//
                map.put(key, new ArrayList<>()); // aet: ["value1", "value2", "...."];
            }
            map.get(key).add(word); // aet: ["eat", "ate", "tea"];
        }
        List<List<String>> result = new ArrayList<>(map.values()); // [["eat", "ate", "tea"], ["bat", "tab"], ["cat"], ["silent", "listen"], ["jump"], ["pump"]]
        System.out.println(result); // [[eat, ate, tea], [bat, tab], [cat], [silent, listen], [jump], [pump]]
    }
}
