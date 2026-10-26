//1️⃣1️⃣ Find sum of all numbers.
package Java8.D_StreamAPI.Programs.Medium;

import java.util.List;

public class Q11_SumOfAllNum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list
                .stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        int sum = list
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
/*
I can use reduce() to aggregate elements into a single value, or I can use
mapToInt().sum() which is more efficient for numeric streams.
*/

/*
Because it converts Stream<Integer> to IntStream, which has built-in
sum(), max(), getMin(), and avoids boxing/unboxing overhead.
 */