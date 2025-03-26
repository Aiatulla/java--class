package Exercises;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListQ {

//    26. Write a Java program to replace an element in a linked list
    public void q26(LinkedList<Integer> list, Integer number, Integer toNumber){
        System.out.println("List before: " + list);
        list.set(list.indexOf(number), toNumber);
        System.out.println("After replacing: " + list);
    }

//    25. Write a Java program to check if a linked list is empty or not.
    public boolean q25(LinkedList<Integer> list){
        boolean b = list.isEmpty();
        return b;
    }

//    24. Write a Java program to compare two linked lists.
    public boolean q24(LinkedList<Integer> list1, LinkedList<Integer> list2){
        return list2.equals(list2);

    }

//    23. Write a Java program to convert a linked list to an array list.
    public void q23(LinkedList<Integer> ll){
        ArrayList<Integer> al = new ArrayList<>(ll);
        System.out.println("Array list: " + al);

    }

//    22. Write a Java program to check if a particular element exists in a linked list.
    public boolean q22(LinkedList<Integer> ll, Integer el){
        return ll.contains(el);
    }

//    21. Write a Java program to retrieve, but not remove, the last element of a linked list.
    public void q21(LinkedList<Integer> ll){
        Integer lastEl = ll.getLast();
        System.out.println("Last element: " + lastEl);
        System.out.println("List: " + ll);

    }

}
