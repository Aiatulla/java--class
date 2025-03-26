package Exercises;

import java.util.HashMap;
import java.util.Map;

public class HashMapQ {
//    12. Write a Java program to get a collection view of the values contained in this map.

    public void q12(HashMap<Integer, String > hm){
        for (Map.Entry<Integer, String> el: hm.entrySet()){
            System.out.println("Keys: " + el.getValue());
        }
    }

//    11. Write a Java program to get a set view of the keys contained in this map.

    public void q11(HashMap<Integer, String > hm){
        for (Map.Entry<Integer, String> el: hm.entrySet()){
            System.out.println("Keys: " + el.getKey());
        }
    }

//    10. Write a Java program to get the value of a specified key in a map.

    public void q10(Map<Integer, String> map, Integer key){
        System.out.println(map.get(key));
    }

//    9. Write a Java program to create a set view of the mappings contained in a map.
    public void q9(HashMap<Integer, String > hm){
        for (Map.Entry<Integer, String> el: hm.entrySet()){
            System.out.println("Key:" + el.getKey() + "Value: " + el.getValue());
        }
    }

//    8. Write a Java program to test if a map contains a mapping for the specified value.
    public void q8(HashMap<Integer, String > hm, String val){
        for (Map.Entry<Integer, String> el: hm.entrySet()){
            if (el.getValue().equals(val)) System.out.println("Map contain" + val);
        }
    }

    public void q6(HashMap<Integer, String> hm) {
        // Creating a shallow copy of the HashMap using clone
        HashMap<Integer, String> shallowCopy = (HashMap<Integer, String>) hm.clone();

        // Printing the shallow copy to verify
        System.out.println("Original HashMap: " + hm);
        System.out.println("Shallow Copy HashMap: " + shallowCopy);
    }

}
