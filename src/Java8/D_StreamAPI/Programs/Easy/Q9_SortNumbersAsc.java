//9️⃣ Sort numbers in ascending order.
package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q9_SortNumbersAsc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,4,3,2,1);
        list
                .stream()
                .sorted()
                .forEach(System.out::println);
    }
}
/*
I am using the sorted() intermediate operation,
which sorts elements in natural order using Comparable,
and then using forEach() to print the sorted result.
 */
