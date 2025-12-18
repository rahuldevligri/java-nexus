//WAP to find the max and min occurring character in given string?
package String;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5_MaxRepChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().replaceAll("\\s", "");
//        str.replaceAll("\\s",""); //remove space
        Map<Character, Integer> hm = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            } else{
                hm.put(ch, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        for(Map.Entry<Character, Integer> me : hm.entrySet()){
            if(maxCount < me.getValue()){
                maxCount = me.getValue();
                maxChar = me.getKey();
            }
        }
        System.out.print(maxChar + " is maximum repeted: " + maxCount);
    }
}
