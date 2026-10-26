package Java8.A_LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        System.out.println("Ecploring lambda expression");

        MyInter myInter = () -> System.out.println("mymethod implementaion using lambda");
        myInter.myMethod();

        MyInter myInter1 = () -> {
            System.out.println("First Line");
            System.out.println("Secound Line");
            System.out.println("Third Line");
        };
        myInter1.myMethod();

        Addition addition = (int a, int b, int c) -> System.out.println("sum is " + (a+b+c));
        addition.add(1,2,3);

        List<String> list = new ArrayList<>();
        list.add("Radha");
        list.add("Rahul");
        list.forEach((String x) -> {
            System.out.println(x);
        });
    }
}
