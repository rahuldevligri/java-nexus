import java.util.Scanner;

public class VolOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();
        System.out.print("Enter Hight: ");
        int h = sc.nextInt();
        System.out.println("VAlue is: " + (l * b * h));
        sc.close();
    }
}
