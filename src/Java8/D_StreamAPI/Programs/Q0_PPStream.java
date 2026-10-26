//You have list you have to find sum of square of  all even number.
package Java8.D_StreamAPI.Programs;

import java.util.Arrays;
import java.util.List;

public class Q0_PPStream {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2,5,6,3,5,9,8,12,26);
        numList
                .stream()
                .filter(item -> item%2==0)
                .map(item -> item * item)
                .reduce((item1,item2) -> item1+item2)
                .ifPresent(System.out::println);
    }
}











