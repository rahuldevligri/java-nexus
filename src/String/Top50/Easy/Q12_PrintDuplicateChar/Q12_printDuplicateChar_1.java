//Print duplicate characters in a string
/*
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top50.Easy.Q12_PrintDuplicateChar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q12_printDuplicateChar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();
        Map<Character, Integer> lhm = new LinkedHashMap<>();
        for(int i = 0; i < str1.length(); i++){
            if(lhm.containsKey(str1.charAt(i))){
                lhm.put(str1.charAt(i), lhm.get(str1.charAt(i))+1);
            } else {
                lhm.put(str1.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> me : lhm.entrySet()){
            if(me.getValue() > 1){
                System.out.println(me.getKey());
            }
        }
    }
}
