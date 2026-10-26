package Java8.D_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        //1. Empty Stream
        Stream<Object> emptyStream = Stream.empty();
        System.out.println(emptyStream.count());//0

        System.out.println();

        //2. From Collection:
        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        System.out.println();

        //3. From Array
        Stream<Integer> stream1 = Stream.of(1,2,3,4);
        String[] names = {"Rahul", "Radha"};
        Stream<String> nameStream = Arrays.stream(names);
        nameStream.forEach(System.out::println);

        System.out.println();

        //4. Using Builder
        Stream<Integer> stream2 = Stream
                .<Integer>builder()
                .add(10)
                .add(20)
                .build();
        stream2.forEach(System.out::println);

        System.out.println();

        //5. Using generate(): used for infinite streams.
        Stream<String> stream3 = Stream.generate(() -> "Hello").limit(5);
        stream3.forEach(System.out::println);

        System.out.println();

        //6. Using iterate():
        Stream<Integer> stream4 = Stream.iterate(0, n -> n + 2).limit(5);
        stream4.forEach(System.out::println);

        System.out.println();

        //7. Primitive Streams -> Range start is inclusive, end is exclusive.
        IntStream.range(1, 5).forEach(System.out::println);
    }
}



