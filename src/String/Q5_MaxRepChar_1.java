//WAP to find the max and min occurring character in given string?
package String;
import java.util.Scanner;

public class Q5_MaxRepChar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().replaceAll("\\s", "");
//        str.replaceAll("\\s",""); //remove space
        int[] arr = new int[127];
        for(int i = 0;i<str.length();i++){
            arr[str.charAt(i)] +=1;
        }
        int max = -1;
        char c = ' ';
        for(int i=0;i<str.length();i++){
            if(max < arr[str.charAt(i)]){
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        System.out.print(c + " is maximum repeted: " + max);
    }
}
