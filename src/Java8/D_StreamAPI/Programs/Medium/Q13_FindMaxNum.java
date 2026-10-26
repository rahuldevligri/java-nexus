// 1️⃣3️⃣ Find maximum number in list.
package Java8.D_StreamAPI.Programs.Medium;

import java.util.Comparator;
import java.util.List;

public class Q13_FindMaxNum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,7,6,5,4,3,1);
        list.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);
/*
I use the reduce() terminal operation with Integer::max to compare elements
and return the maximum value. Since reduce() without an identity returns
Optional, I use ifPresent() to safely print the result.
 */
        //or
        list.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);
        //or
        int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(max);

        //2nd Highest number form list.
        list.stream()
                .distinct() //→ removes duplicates
                .sorted(Comparator.reverseOrder()) //→ sorts descending
                .skip(1) // → skips highest element
                .findFirst() //→ gets second highest
                .ifPresent(System.out::println); //→ safely handles Optional
/*
First, I removed duplicates using distinct(). Then I sorted the elements in
descending order using Comparator.reverseOrder(). After that, I skipped the
first element using skip(1), and finally used findFirst() to get the secound
highest number.
*/

        //Find 2nd highers number without using sorted().
        int[] result = list.stream()
                .distinct()
                .collect(
                        () -> new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE},
                        (acc, numb) -> {
                            if(numb > acc[0]) {
                                acc[1] = acc[0];
                                acc[0] = numb;
                            } else if(numb > acc[1]){
                                acc[1] = numb;
                            }
                        },
                        (a, b) -> {}
                );
        System.out.println(result[1]);
    }
}
