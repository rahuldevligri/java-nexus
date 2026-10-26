import java.util.Scanner;

public class AvgOFThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Num: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Num: ");
        int c = sc.nextInt();
        System.out.println("AVg is: " + (a + b + c) / 3);
    }
}
