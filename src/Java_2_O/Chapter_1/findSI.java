import java.util.Scanner;

public class findSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Time; ");
        int t = sc.nextInt();
        System.out.println("SI: " + (p * r * t) / 100);
    }
}
