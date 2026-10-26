/* Given a string, return the first non-repeating character.
Input: "aabbcdde"
Output: c
*/
package Interview_Prep;
import java.util.HashMap;
import java.util.Map;
public class Q2_NonRepChar {
    public static void main(String[] args) {
        String str = "aabbcddee" ;
        Map<Character, Integer> map = new HashMap<>();
        for(char a : str.toCharArray()){
            if(!map.containsKey(a)) map.put(a, 0);
            map.put(a, map.get(a)+1);
        }
        for(Map.Entry<Character, Integer> em : map.entrySet()){
            if(em.getValue()==1){
                System.out.println(em.getKey());
            }
        }
    }
}
