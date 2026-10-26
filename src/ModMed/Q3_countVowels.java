package ModMed;

public class Q3_countVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        str.toLowerCase();

        //using stream API
        long count = str.chars().filter(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u').count();
        System.out.println(count);

        // Using for loop
        int c = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                c++;
            }
        }
        System.out.println(c);
    }
}
