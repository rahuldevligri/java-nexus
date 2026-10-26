//2️⃣ Print all even numbers from a list.
package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q2_PrintAllEvenNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list
                .stream()
                .filter(x -> x%2==0)
                .forEach(System.out::println);
    }
}
/*
I am converting the list into a stream, then using filter() intermediate operation
to keep only even numbers, and finally using forEach() terminal operation to
print them.
 */

