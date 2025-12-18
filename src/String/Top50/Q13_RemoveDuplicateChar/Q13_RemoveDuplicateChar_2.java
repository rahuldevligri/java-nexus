package String.Top50.Q13_RemoveDuplicateChar;
import java.util.Scanner;
public class Q13_RemoveDuplicateChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!seen[ch]){
                seen[ch] = true;
                sb.append(ch);
            }
        }
        System.out.println("After removing duplicates: " + sb);
    }
}
