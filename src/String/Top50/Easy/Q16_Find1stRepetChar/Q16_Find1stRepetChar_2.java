/* Find the FIRST REPEATING character in a string
*/
package String.Top50.Easy.Q16_Find1stRepetChar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q16_Find1stRepetChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        Map<Character, Integer> lhm = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(lhm.containsKey(str.charAt(i))){
                lhm.put(str.charAt(i), lhm.get(str.charAt(i))+1);
            } else {
                lhm.put(str.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> em : lhm.entrySet()){
            if(em.getValue() > 1){
                System.out.println(em.getKey());
                break;
            }
        }
    }
}