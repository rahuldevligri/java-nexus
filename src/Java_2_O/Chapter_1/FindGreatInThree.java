import java.util.Scanner;

public class FindGreatInThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int a = sc.nextInt();
        System.out.print("Emter 2nd Num: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Num: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.print(a + " Is Greatest");
        } else if (b > c) {
            System.out.print(b + " Is Greatest");
        } else {
            System.out.print(c + " Is Greatest");
        }
    }
}
