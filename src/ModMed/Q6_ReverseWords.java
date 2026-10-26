package ModMed;

public class Q6_ReverseWords {
    public static void main(String[] args) {
        String str = "Java is easy";

        //1. Reverse the Order of Words
        //using StringBuilder
//        StringBuilder sb = new StringBuilder();
//        String[] words = str.split(" ");
//        for(int i = words.length-1;i>=0;i--){
//            sb.append(words[i]).append(" ");
//        }
//        System.out.println(sb);

        //2. Reverse Each Words
        String[] words = str.split(" ");
        for(String word : words){
            for(int i = words.length - 1; i >= 0; i--){
                System.out.println(word.charAt(i));
            }
            System.out.println(" ");
        }
//        System.out.println(sb1);
    }

}
