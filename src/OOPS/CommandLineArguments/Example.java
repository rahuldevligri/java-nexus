package OOPS.CommandLineArguments;

public class Example {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }
        System.out.println(); //add new line after arguments print
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);// convert each argument into int then add in sum variable
        }
        System.out.println("sum: " + sum);
    }
}








