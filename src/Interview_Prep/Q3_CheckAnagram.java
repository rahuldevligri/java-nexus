package Interview_Prep;

public class Q3_CheckAnagram {
    public static void main(String[] args) {
        String a =  "listen", b = "silent";
        char[] freq = new char[256];
        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)]++;
        }
        for(int i=0;i<b.length();i++){
            freq[b.charAt(i)]--;
        }
    }
}
