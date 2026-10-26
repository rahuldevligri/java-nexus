import java.util.Scanner;

public class NumPoNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.print("Num is: " + num + " +ve");
        } else if (num < 0) {
            System.out.print("Num is: " + num + " -ve");
        } else {
            System.out.println("Num is: " + num + " Zero");
        }
    }
}
