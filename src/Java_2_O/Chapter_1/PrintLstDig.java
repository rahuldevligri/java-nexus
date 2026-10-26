import java.util.Scanner;

public class PrintLstDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        System.out.println("last Digit: " + num % 10);
    }
}
