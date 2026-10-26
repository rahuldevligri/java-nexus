import java.util.Scanner;

public class NumDivByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("True");
        } else {
            System.out.print("False");
        }
    }
}
