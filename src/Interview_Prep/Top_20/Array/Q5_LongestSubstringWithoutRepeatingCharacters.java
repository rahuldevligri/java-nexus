package Interview_Prep.Top_20.Array;

import java.util.HashSet;

public class Q5_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(longestSubstringWithoutRepeatingCharacters(s));
    }
    static int longestSubstringWithoutRepeatingCharacters(String str){
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0;right < str.length(); right ++){
            char current = str.charAt(right);

            if(set.contains(current)){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }//time complexity: O(n)
    //space complexity: O(n)
}
