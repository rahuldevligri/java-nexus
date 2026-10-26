//8️⃣ Remove duplicate elements from list.

package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q8_removeDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,3,2,1);
        list
                .stream()
                .distinct()
                .forEach(System.out::println);
    }
}
/*
I use the distinct() intermediate operation, which removes duplicate elements
based on equals() and hashCode(), and then I use a terminal operation like
forEach() or collect() to get the result.
 */



