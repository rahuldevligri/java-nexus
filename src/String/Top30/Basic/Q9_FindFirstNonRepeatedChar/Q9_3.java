/* 9️⃣ Find First Non-Repeated Character
⏱ Complexity
Time: O(n)
Space: O(n)
 */
package String.Top30.Basic.Q9_FindFirstNonRepeatedChar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Q9_3 {
    private static char findFirstNonRepeatedChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
            queue.add(c);
            while(!queue.isEmpty() && map.get(queue.peek()) > 1){
                queue.poll(); //remove first insert char
            }
        }
        return queue.isEmpty() ? '_' : queue.peek();
    }
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("swiss"));
    }
}

/*
“I use a HashMap to store frequency and a queue to maintain insertion order.
For each character, I update its count and add it to the queue.
Then I remove all characters from the front of the queue whose frequency
becomes greater than one. The front of the queue always holds the first
non-repeating character.”
 */