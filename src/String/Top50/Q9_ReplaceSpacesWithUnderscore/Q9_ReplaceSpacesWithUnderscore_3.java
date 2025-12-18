package String.Top50.Q9_ReplaceSpacesWithUnderscore;

import java.util.Scanner;

public class Q9_ReplaceSpacesWithUnderscore_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println(str.replace(" ","_"));
    }
}
