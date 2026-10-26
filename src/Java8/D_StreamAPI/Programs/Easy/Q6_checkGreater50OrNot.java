// 6️⃣ Check if any number is greater than 50.
package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q6_checkGreater50OrNot {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,10,50,90,120);

        boolean result = list.stream().anyMatch(x -> x > 50);
        System.out.println(result);
    }
}
/*
I use the anyMatch() terminal operation, which takes a
Predicate and returns true if at least one element
satisfies the condition. It is also a short-circuiting operation.
 */
