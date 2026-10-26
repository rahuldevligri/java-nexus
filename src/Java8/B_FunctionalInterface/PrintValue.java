package Java8.B_FunctionalInterface;

import Java8.A_LambdaExpression.MyInter;

public class PrintValue {
    public static MyInter createValue(Findable findable){
        System.out.println("Inside Create Value method");
        findable.find();
        System.out.println("Creating Value");
        return () -> {
            System.out.println("implementation of myInter form createValue method");
        };
    }
}
