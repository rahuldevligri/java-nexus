package Interview_Prep.Top_20.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        //add
        for(int i = 1; i <=5; i++){
            hs.add(i);
        }

        //duplicate not allowed
        hs.add(1);

        //remove
        hs.remove(1);

        //check present or not
        System.out.println(hs.contains(1));

        //get
        Iterator<Integer> i = hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
