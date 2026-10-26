//3️⃣ Print square of all numbers.

package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q3_PrintSquareOfAllNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream().map(x -> x * x)
                .forEach(System.out::println);
    }
}
/*
I am using map() intermediate operation to transform each number into
its square, and then using forEach() terminal operation to print the result.
 */
