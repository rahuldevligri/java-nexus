//1️⃣ Print all elements using Stream.
package Java8.D_StreamAPI.Programs.Easy;

import java.util.Arrays;
import java.util.List;

public class Q1_PrintAllElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        list.stream().forEach(System.out::println);
        //or
        list.forEach(System.out::print);
    }
}

/*
I am converting the list into a stream using stream() method and then using
forEach() terminal operation to print each element. Since forEach() is a
terminal operation, it triggers execution of the stream.
*/