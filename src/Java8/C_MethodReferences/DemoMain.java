package Java8.C_MethodReferences;

public class DemoMain {
    public static void main(String[] args) {
        //static method regerence
        Findable findable = Calculator::doCalculator;
        findable.find();

        //Non-Static method reference
        Calculator cal = new Calculator();//object creation
        Findable findable1 = cal:: doCalculatorNonStatic;//calling using obj
        findable1.find();
        //or
        Findable findable2 = new Calculator():: doCalculatorNonStatic;
        findable2.find();

        //constructor reference
        Findable findable3 = Calculator::new;
        findable3.find();

    }
}
