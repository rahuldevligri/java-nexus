import java.util.Scanner;

public class SwapVOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num a: ");
        int a = sc.nextInt();
        System.out.print("Enter Num b: ");
        int b = sc.nextInt();
        a = b - a;
        b = b - a;
        a = b + a;
        System.out.println("a: " + a + " b: " + b);
    }

}
