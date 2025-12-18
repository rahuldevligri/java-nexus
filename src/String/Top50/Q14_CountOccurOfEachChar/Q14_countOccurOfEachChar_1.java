/* Count occurrences of each character in a string?
⏱ Complexity
Time: O(n)
Space: O(n)
*/
package String.Top50.Q14_CountOccurOfEachChar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q14_countOccurOfEachChar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Map<Character, Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
            if(hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            else
                hm.put(str.charAt(i), 1);
        for(Map.Entry<Character, Integer> me : hm.entrySet())
            System.out.println(me.getKey() + " -> " + me.getValue());
    }
}
