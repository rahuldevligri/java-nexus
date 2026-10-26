package Java8.B_FunctionalInterface;

@FunctionalInterface
public interface Findable {
    //abstract method
    void find();

    //static method
    public static void testMethod(){
        System.out.println("Static Method in Interface");
    }

    //default method
    default void defaultTestMethod(){
        System.out.println("This is default method");
    }
}
