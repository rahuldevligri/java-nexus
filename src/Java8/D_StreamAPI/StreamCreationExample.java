package Java8.D_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args) {
        //1. Empty Stream
        Stream<Object> emptyStram = Stream.empty();
        System.out.println(emptyStram.count()); //0

        //2. Stream from collection.
        List<String> laptops = new ArrayList<>();
        laptops.add("Macbook Pro");
        laptops.add("HP 12345");
        laptops.add("Dell Laptitude");

        Stream<String> collectionStream = laptops.stream();
        System.out.println(collectionStream.count());
        laptops.forEach(System.out::println);

        //3. Stream of Array
        Stream<Integer> integerStream = Stream.of(2, 7, 8, 9, 93, 5);
        System.out.println(integerStream.count());

        String[] studentNames = {"Radha", "Rahul", "Rohit", "Uma", "Ravi"};
        Stream<String> arrayStream = Arrays.stream(studentNames);
        System.out.println(arrayStream.count());

        //create stream using builder method...
        //4. Uisng builder to create steram
        Stream<Integer> integerStream1 = Stream.<Integer>builder()
                .add(24).add(26).add(27).add(29)
                .build();
        System.out.println(integerStream1.count());

        //5. Creating Stream uisng generate
        Stream<String> generatedStream = Stream.generate(() -> "Rahul" ).limit(5);
        System.out.println("generatedStream: "+ generatedStream.count());

        //6. creating stream using iterate
        Stream<Integer> itrStream = Stream.iterate(100, (n) ->n+2).limit(5);
        // System.out.println(itrStream.count());
        itrStream.forEach(System.out::println);

        //7. creating streams using primitive streams
        //Integer, Long and Double stream is available
        //start included and end exclusive
         IntStream rangeStream = IntStream.range(1, 10);
//        System.out.println(rangeStream.count());
         rangeStream.forEach(System.out::println);

         IntStream chars = "this is testing".chars();
         chars.forEach(System.out::println);
//         chars.forEach(item -> System.out.println((char)item));
    }
}
