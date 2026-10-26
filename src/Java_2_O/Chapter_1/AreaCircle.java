import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Redius: ");
        int r = sc.nextInt();
        float Pi = 3.14159f;
        System.out.println("Redius: " + (Pi * r * r));
    }

}
