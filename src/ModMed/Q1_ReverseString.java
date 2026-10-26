package ModMed;

//Reverse String -> "Hello" --> olleH
public class Q1_ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        String r = "";

        //loop
        for(int i = s.length()-1; i >= 0;i--){
            r += s.charAt(i);
        }
        System.out.println(r);

        //String builder
        StringBuilder sb = new StringBuilder("Hello").reverse();
        System.out.println(sb);

        //two pointer
        char[] ch = "Helllo".toCharArray();
        int start = 0;
        int end = ch.length-1;
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(new String(ch));
    }
}
