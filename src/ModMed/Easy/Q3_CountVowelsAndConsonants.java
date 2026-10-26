package ModMed.Easy;

public class Q3_CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Rahul Radha";
        approach_1(str);
    }

    //Using if-else ⭐ (Best Interview Solution)
    static void approach_1(String str){
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' ||  str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: "+ vowels + " Consonants: "+ consonants);
    }
}

















