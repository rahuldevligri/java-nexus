//9️⃣ Count Vowels and Consonants?
package String.Top10;

public class Q9_CountVowelsConsonants {
    static void countVowelsConsonants(String s){
        int v = 0, c = 0;
        s = s.toLowerCase();
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if("aeiou".indexOf(ch) != -1)
                    v++;
                else
                    c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
    public static void main(String[] args) {
        countVowelsConsonants("radharaman");
    }
}
