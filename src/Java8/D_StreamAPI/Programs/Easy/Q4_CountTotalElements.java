//4️⃣ Count total elements in a list.
package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q4_CountTotalElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Radha");

        long count = names.stream().count();
        System.out.println(count);
    }
}

/*
I am converting the collection into a stream and using the count() terminal
operation, which returns the total number of elements as a long value.
 */
