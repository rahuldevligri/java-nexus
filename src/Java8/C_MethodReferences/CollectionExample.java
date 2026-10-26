package Java8.C_MethodReferences;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(45);
        list.add(355);
        list.add(55);

        list.forEach(CustomPrint::printValue);
        //or
        list.forEach(System.out::println);
    }
}
