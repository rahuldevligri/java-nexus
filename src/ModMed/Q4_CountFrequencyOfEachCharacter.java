package ModMed;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Q4_CountFrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "Programming";

        //using hashMap
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        System.out.println(map);

        //using keySet
        for (char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }

        //using stream api
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        //using advance stream
        String result = map.entrySet().stream()
                .map(entry -> entry.getKey() + " -> " + entry.getValue())
                .collect(Collectors.joining("\n"));

        System.out.println(result);
    }
}
