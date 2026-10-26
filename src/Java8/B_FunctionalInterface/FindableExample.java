package Java8.B_FunctionalInterface;

import Java8.A_LambdaExpression.MyInter;

public class FindableExample {
    public static void main(String[] args) {
        Findable findable = () -> {
            System.out.println("This is find method body");
        };
        findable.find();
        findable.defaultTestMethod();
        Findable.testMethod();

       MyInter myInter = PrintValue.createValue(() -> {
            System.out.println("this is implementation of finding PrintValue");
        });
       myInter.myMethod();
    }
}







