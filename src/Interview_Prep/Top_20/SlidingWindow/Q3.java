/*Given a word pat and a text txt. Return the count of the occurences of anagrams of the word in the text.
Example 1:
Input: txt = forxxorfxdofr & pat = for
Output: 3
Explanation: for, orf and ofr appears in the txt, hence answer is 3.

Example 2:
Input: txt = aabaabaa & pat = aaba
Output: 4
Explanation: aaba is present 4 times in txt. . */
package Interview_Prep.Top_20.SlidingWindow;

import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        Approach1(); //slow
        Approach2(); //best
    }

    //approach-1 map traversing that's why slow
    private static void Approach1() {
        String str = "aabaabaa";
        String pat = "aaba";
        int i,j,count;
        i = j = count = 0;
        HashMap<Character, Integer> ptr = new HashMap<>();
        HashMap<Character, Integer> check = new HashMap<>();
        for(char c : pat.toCharArray()){
            ptr.put(c, ptr.getOrDefault(c, 0)+1);
        }
        while(j < str.length()){
            check.put(str.charAt(j), check.getOrDefault(str.charAt(j), 0)+1);

            if ((j-i)+1 < pat.length()){
                j++;
            } else{
                if(ptr.equals(check)){
                    count++;
                }
                check.put(str.charAt(i), check.get(str.charAt(i))-1);
                if(check.get(str.charAt(i)) == 0){
                    check.remove(str.charAt(i));
                }
                i++;
                j++;
            }
        }
        System.out.println(count);
    }


    //best approach
    public static void Approach2(){
        String str = "aabaabaa";
        String pat = "aaba";
        int k = pat.length();
        int i = 0, j = 0;
        int count;
        int ans = 0;

        HashMap<Character, Integer> ptr = new HashMap<>();

        for(char c : pat.toCharArray()){
            ptr.put(c, ptr.getOrDefault(c, 0) + 1);
        }
        count = ptr.size();

        while(j < str.length()){
            char right = str.charAt(j);
            if(ptr.containsKey(right)){
                ptr.put(right, ptr.get(right)-1);

                if(ptr.get(right) == 0){
                    count--;
                }
            }

            if((j-i)+1 < k){
                j++;
            } else if((j-i)+1 == k){
                if(count == 0){
                    ans++;
                }

                char left = str.charAt(i);
                if(ptr.containsKey(left)){
                    if(ptr.get(left) == 0){
                        count++;
                    }

                    ptr.put(left, ptr.get(left)+1);
                }

                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}