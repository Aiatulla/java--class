package Exercises;

import java.util.*;

public class HashSetQ {
    // 12. Write a Java program to remove all elements from a hash set.
    public void q12(HashSet<Integer> hs){
        hs.clear();
    }

    // 11. Write a Java program to compare two sets and retain elements that are the same.
    public void q11(HashSet<Integer> hs1, HashSet<Integer> hs2){
        System.out.println("Intersection:" + hs1.retainAll(hs2));
    }

    // 9. Write a Java program to find numbers less than 7 in a tree set.
    public void q9(TreeSet<Integer> ts){
        // 1 way
        // List<Integer> list = new ArrayList<>();
        // ts.forEach(el -> {
        //     if (el < 7) list.add(el);
        // });
        // System.out.println("Elements less than 7:" + list);

        // 2 way:
        Set<Integer> t = ts.headSet(7);
        System.out.println(t);
    }

    // 8. Write a Java program to convert a hash set to a tree set.
    public void q8(HashSet<Integer> hs){
        TreeSet<Integer> ts = new TreeSet<>(hs);
        System.out.println(ts);
    }

    // 7. Write a Java program to convert a hash set to an array.
    public void q7(HashSet<Integer> hs){
        ArrayList<Integer> al = new ArrayList<>(hs);
        System.out.println(al);
    }

    // 6. Write a Java program to clone a hash set to another hash set.
    public void q6(HashSet<Integer> hs){
        HashSet<Integer> newHs = (HashSet<Integer>) hs.clone();
        System.out.println(newHs);
    }
}
