package String.Top10;

public class Q4_CountFreqChar {
    public static void charFrequency(String str){
        int[] freq = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)i + " :" + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        charFrequency("RadhaRahul");
    }
}
