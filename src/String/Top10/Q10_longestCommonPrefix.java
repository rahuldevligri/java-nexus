package String.Top10;

public class Q10_longestCommonPrefix {
    static String longestCommonPrefix(String[] s){
        if(s.length == 0) return "";
        String prefix = s[0];
        for(int i=1;i<s.length;i++){
            while(!s[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] str = {"radha","rahul"};
        System.out.println(longestCommonPrefix(str));
    }
}
