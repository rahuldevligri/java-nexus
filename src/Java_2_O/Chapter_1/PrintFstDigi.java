import java.util.Scanner;

public class PrintFstDigi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Num: ");
        int num = sc.nextInt();
        System.out.println("1st Digit: " + num / 10);
    }
}
