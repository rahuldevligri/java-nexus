import java.util.Scanner;

public class MarksResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Science Marks: ");
        int sci = sc.nextInt();
        System.out.print("Enter Math Marks: ");
        int mat = sc.nextInt();
        System.out.print("Enter English Marks: ");
        int eng = sc.nextInt();
        System.out.print("Enter Hindi Marks: ");
        int hin = sc.nextInt();
        System.out.print("Enter Sanskrit Marks: ");
        int san = sc.nextInt();
        int msk = sci + mat + eng + hin + san;
        if (msk >= 60) {
            System.out.println(" SUPER....Pass With 1st Division");
        } else if (msk >= 40 && msk <= 60) {
            System.out.println("GOOD Pass With 2nd Division");
        } else if (msk >= 36 && msk < 40) {
            System.out.println("BC Pass With 3rd Division");
        } else {
            System.out.println("Mc FAIL mar ja re tu");
        }
    }
}
