package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static void main(String[] args) {
        // Created
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // size
        System.out.println(set.size());

        // print all element
        System.out.println(set);

        // iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(it.hasNext());

        // search - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("Does not content 6");
        }

        // delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we deleted 1");
        }

    }
    
}
