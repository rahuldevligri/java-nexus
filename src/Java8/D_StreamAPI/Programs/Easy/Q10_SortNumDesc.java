//🔟 Sort numbers in descending order.
/*
Using (a, b) -> b - a may cause integer overflow in some cases.
Comparator.reverseOrder() is cleaner and safer.
 */
package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q10_SortNumDesc {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,7,3,2,9,8,1);
        list
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
/*
I use the sorted() intermediate operation with Comparator.reverseOrder() to
sort elements in descending order, and then use forEach() to print the result.
 */
