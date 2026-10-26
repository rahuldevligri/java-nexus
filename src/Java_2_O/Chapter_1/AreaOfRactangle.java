import java.util.Scanner;

public class AreaOfRactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int L = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int B = sc.nextInt();
        System.out.print("Area Of Ractangle: " + (L * B));
    }

}
