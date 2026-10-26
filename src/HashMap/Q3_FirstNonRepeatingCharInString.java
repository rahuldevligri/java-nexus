package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Q3_FirstNonRepeatingCharInString {
    static char firstNonRepeating(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c : s.toCharArray()){
            if(map.get(c) ==1){
                return c;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String str = "radharaman";
        System.out.println(firstNonRepeating(str));
    }
}
