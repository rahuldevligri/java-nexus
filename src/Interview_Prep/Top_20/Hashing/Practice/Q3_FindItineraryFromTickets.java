package Interview_Prep.Top_20.Hashing.Practice;

import java.util.HashMap;

public class Q3_FindItineraryFromTickets {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai","Bengaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi","Goa");
        findItineraryFromTickets(hm);
    }

    public static void findItineraryFromTickets(HashMap<String, String> hm){
        String start="";
        for(String key : hm.keySet()){
            if(!hm.containsValue(key)){
                start = key;
            }
        }

        while(hm.containsKey(start)){
            System.out.print(start + " -> ");
            start = hm.get(start);
        }
        System.out.println(start);
    }
}
