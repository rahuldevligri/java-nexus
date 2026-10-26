package ModMed;

public class Q9_LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"flow", "flower", "flight"};

        if (strs.length == 0) {
            System.out.println("");
            return;
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        System.out.println(prefix);
    }
}



