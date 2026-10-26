package ModMed;

public class Q5_RemoveSpace {
    public static void main(String[] args) {
        String str = "Hello World";

        //using StringBuilder
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(ch != ' ') sb.append(ch);
        }
        System.out.println(sb);

        //using replace()
        System.out.println("Hello World".replace(" ",""));

        //using replaceAll()
        System.out.println("Hello Wo rld".replaceAll("\\s", ""));
    }
}
