//1️⃣2️⃣ Find sum of square of even numbers.
package Java8.D_StreamAPI.Programs.Medium;

import java.util.List;

public class Q12_SumOfSquareOfEvenNum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        list.stream()
                .filter(x -> x%2==0) //2,4
                .map(x -> x*x) //4, 16
                .reduce(Integer::sum) //4 + 16 = 20
                .ifPresent(System.out::println); // 20

        //or
        int sum = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x * x)
                .sum();
        System.out.println(sum);
    }
}
/*
First, I filtered even numbers using filter(). Then I transformed each
number into its square using map(). Finally, I used reduce() to sum all
squared values and handled the Optional result using ifPresent().
 */