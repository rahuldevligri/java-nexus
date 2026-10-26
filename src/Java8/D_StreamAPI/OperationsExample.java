package Java8.D_StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class OperationsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jaipur", "Delhi", "Tonk", "Hyderbad");
        System.out.println(list);
        //1. Operation - forEach()
        list.stream().forEach((item) -> {
            System.out.println(item);
            System.out.println("length: " + item.length());
            System.out.println("==============>");
        });

        List<Integer> numList = Arrays.asList(2,5,6,3,7,4,12,10,9,8,1);
        //2. Operation - filter()
        System.out.println(numList);
        numList
                .stream()
                .filter(item -> item % 2 == 0)
                .forEach(System.out::print);
        System.out.println("-------------------------");

        //3. operation - map
        numList
                .stream()
                .map((item -> item * item))
                .forEach(System.out::println);
        System.out.println("-------------------------");

        //4. operation - reduce()
        numList
                .stream()
                .reduce((item1, item2) -> item1 + item2)
                .ifPresent(System.out::println);
        System.out.println("-------------------------");

        //5. collect
        List<Integer> filteredList = numList
                .stream()
                .filter(item -> item%2==0)
                .collect(Collectors.toList());
        System.out.println(filteredList);
        System.out.println("-------------------------");

        //6. Find 1st
        numList.stream().findFirst().ifPresent(System.out::println);
        System.out.println("-------------------------");

        //7. Operation sorted()
        List<Integer> list1 = numList
                .stream()
                .sorted((item1, item2) -> item2 - item1)
                .collect(Collectors.toList());
        System.out.println(list1);

        //assending order
        list
                .stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-");
        //desending order
        list
                .stream()
                .sorted((item1, item2) -> -item1.compareTo(item2))
                .forEach(System.out::println);
        System.out.println("---------------------");

        //8. Operation - distinct()
        List<Integer> duplist = Arrays.asList(1,2,2,3,3,3,4,5);
        duplist.stream().distinct().forEach(System.out::print);
        System.out.println("-------------------------");

        //9. operation - flatMap()
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6, 7, 8)
        );
        List<Integer> collectedList = nestedList
                .stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(nestedList);
        System.out.println("-------------------------");

        //10. operation - limit(); and skip()
        collectedList
                .stream()
                .skip(4)
                .forEach(System.out::print);
        System.out.println("-------------------------");
        collectedList.stream().limit(5).forEach(System.out::print);
        System.out.println("-------------------------");
    }
}
