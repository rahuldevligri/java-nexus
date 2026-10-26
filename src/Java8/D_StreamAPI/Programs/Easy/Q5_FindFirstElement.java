//5️⃣ Find first element of a list.
package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q5_FindFirstElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().findFirst().ifPresent(System.out::println);
    }
}
/*
I am using the findFirst() terminal operation, which returns the first element
wrapped inside an Optional. Then I use ifPresent() to safely print the value
without risking NullPointerException.
 */
