package Interview_Prep.Top_20.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        //add
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30);
        hm.put(4,40);

        //get
        System.out.println(hm.get(1));

        //remove
        hm.remove(2);

        //print values
        System.out.println(hm.values());

        //remove exact key and value if match
        System.out.println(hm.remove(3, 30));

        //iterate using for each loop
        for(int e : hm.values()){
            System.out.println(e);
        }

        //check key present and value present
        System.out.println(hm.containsKey(1) +" " + hm.containsValue(20));

        //map.entry -> iteration
        for(Map.Entry<Integer, Integer> em : hm.entrySet()){
            System.out.println(em.getKey() + "  "+ em.getValue());
        }
    }
}
