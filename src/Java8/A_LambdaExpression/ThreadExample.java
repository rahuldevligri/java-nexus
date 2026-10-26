package Java8.A_LambdaExpression;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable threadRunnable = () -> {
            System.out.println("new Thread");
        };
        Thread thread = new Thread(threadRunnable);

        //or -> lambda passed in constructoer
        Thread thread1 = new Thread(() -> System.out.println("new Thread"));
    }
}








