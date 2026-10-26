import java.util.Scanner;

public class SwapTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num a: ");
        int a = sc.nextInt();
        System.out.print("Enter Num b: ");
        int b = sc.nextInt();
        int c = b;
        b = a;
        a = c;
        System.out.println("a: " + a + " b: " + b);
    }
}
