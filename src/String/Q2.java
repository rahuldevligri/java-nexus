// reverse a string -> "Good Times Comes back" -> "Back Comes Times Good"
package String;

public class Q2 {
    public static void main(String[] args) {
        String str = "Good Times Comes Back";
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                // build word in reverse
                word.insert(0, ch);
            } else {
                // append completed word
                result.append(word).append(" ");
                word.setLength(0);
            }
        }

        // append the first word
        result.append(word);

        System.out.println(result.toString());
    }
}

