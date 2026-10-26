//7️⃣ Check if all numbers are positive.

package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q7_CheckPositiveNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,-8);
        boolean result = list.stream().allMatch(x -> x > 0);
        System.out.println("All Numbers are Postive: " + result);
    }
}
/*
I use the allMatch() terminal operation, which returns true only
if all elements satisfy the given condition. It is also a short-circuiting
operation.
 */