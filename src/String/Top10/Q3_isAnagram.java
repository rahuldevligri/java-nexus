package String.Top10;

public class Q3_isAnagram {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] frq = new int[256];
        for(int i=0;i<s1.length();i++){
            frq[s1.charAt(i)]++;
            frq[s2.charAt(i)]--;
        }
        for(int f : frq){
            if (f !=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}
