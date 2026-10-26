/*5️⃣ Count Vowels and Consonants
⏱ Complexity
Time: O(n)
Space: O(1)
 */
package String.Top30.Basic.Q5_countVowelsConsonants;

public class Q5_1 {
    private static void countVowelsCons(String str){
        str = str.toLowerCase().replaceAll("\\s", "");
        int vowels = 0, consonants = 0;
        for(char c : str.toCharArray()){

            if("aeiou".indexOf(c) != -1){
                vowels++;
            } else {
                consonants++;
            }
//            if(c >= 'a' && c <= 'z'){
//                switch (c){
//                    case 'a' :
//                    case 'e' :
//                    case 'i' :
//                    case 'o' :
//                    case 'u' :
//                        vowels++;
//                        break;
//                    default:
//                        consonants++;
//                }
//            }
        }
        System.out.println("Vowels: " + vowels + " & " + " Consonants: " + consonants);
    }
    public static void main(String[] args) {
        String str = "radharahul";
        countVowelsCons(str);
    }
}