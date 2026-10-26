//write a program to find max element in an array.
public class Q1_findMax {
    public static void main(String[] args){
        int[] arr = {25,37,85,111,24};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
           if(max<arr[i])
                max=arr[i];
        System.out.println(max);
    }    
}
