/*5️⃣ Count Vowels and Consonants
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top30.Basic.Q5_countVowelsConsonants;

public class Q5_3 {
    private static void countVowelsCons(String str){
        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for(char c : str.toCharArray()){
            if (Character.isLetter(c)) {

                char ch = Character.toLowerCase(c);

                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if(Character.isDigit(c)) {
                digits++;
            } else {
                special++;
            }
        }
        System.out.println("Vowels: " + vowels + " & " + " Consonants: " + consonants);
    }
    public static void main(String[] args) {
        countVowelsCons("radharahul");
    }
}