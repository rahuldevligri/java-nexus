/* Find the first non-repeating character in a string
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top50.Q15_Find1stNonRepeatChar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q15_Find1stNonRepeatingChar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Map<Character, Integer> lhm = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(lhm.containsKey(str.charAt(i))){
                lhm.put(str.charAt(i), lhm.get(str.charAt(i))+1);
            } else{
                lhm.put(str.charAt(i), 1);
            }
        }
        boolean found = false;
        for(Map.Entry<Character, Integer> em : lhm.entrySet()){
            if(em.getValue() == 1){
                System.out.println(em.getKey());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No non-repeating character found");
        }
    }
}
