package Hashing;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("india", 120);
        map.put("US", 28);
        map.put("china", 180);

        System.out.println(map);

        map.put("china", 150);


        // // search
        // if(map.containsKey("china")){
        //     System.out.println("present");
        // }
        // else{
        //     System.out.println("NOt Present");
        // }

        // System.out.println(map.get("china"));
        // System.out.println(map.get("chima"));

        int arr[] = {12,13,15};
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
