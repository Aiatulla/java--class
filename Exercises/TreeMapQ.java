package Exercises;

import java.util.*;

public class TreeMapQ {

    // 21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
    public void q21(TreeMap<Integer, String> tm, int sKey, int eKey){
        SortedMap<Integer, String> subMap = tm.subMap(sKey, eKey);
        System.out.println(subMap);
    }

    // 22. Write a Java program to get the portion of a map whose keys range from a given key to another key (inclusive).
    public void q22(TreeMap<Integer, String> tm, int sKey, int eKey){
        SortedMap<Integer, String> subMap = tm.subMap(sKey, true, eKey, true);
        System.out.println(subMap);
    }

    // 23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
    public void q23(TreeMap<Integer, String> tm, int sKey){
        SortedMap<Integer, String> subMap = tm.tailMap(sKey);
        System.out.println(subMap);
    }

    // 24. Write a Java program to get a portion of a map whose keys are greater than a given key.
    public void q24(TreeMap<Integer, String> tm, int sKey){
        SortedMap<Integer, String> subMap = tm.tailMap(sKey + 1);
        System.out.println(subMap);
    }

    // 25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
    public void q25(TreeMap<Integer, String> tm, int key){
        Map.Entry<Integer, String> entry = tm.ceilingEntry(key);
        System.out.println(entry != null ? entry : "No entry found for the given key.");
    }

    // 26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
    public void q26(TreeMap<Integer, String> tm, int key){
        Integer ceilingKey = tm.ceilingKey(key);
        System.out.println(ceilingKey != null ? ceilingKey : "No key found greater than or equal to the given key.");
    }
}
