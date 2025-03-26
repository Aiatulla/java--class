package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQ {

//    22. Write a Java program to print all the elements of an ArrayList using the elements' position.
    public void q22(ArrayList<String> list){
        for (int i=0; i<list.size();i++) System.out.println(i + ": " +list.get(i));
    }

//    21. Write a Java program to replace the second element of an ArrayList with the specified element.
    public void q21(ArrayList<String> list, String givenValue){
        System.out.println("List before: " + list);
        list.set(1,givenValue);
        System.out.println("List after replacing second element with " + givenValue + ": " + list);
    }

//20. Write a Java program to increase an array list size.
    public void q20(ArrayList<String> list){
        System.out.println("Lists size before:" + list.size());
        for (int i = 0; i<=10; i++) {
            list.set(i, "0");
        }
        System.out.println("Lists size after: " + list.size());
    }

//    18. Write a Java program to test whether an array list is empty or not.
    public boolean q18(ArrayList<String> list){
        if (list.size() == 0){
            return true;
        }
        return false;
    }

//    17. Write a Java program to empty an array list
    public void q17(ArrayList<String> list){
        for (int i=0; i<list.size();i++){
            list.remove(i);

        }
        System.out.println("After removeing all elements: " + list);
    }

//    16. Write a Java program to clone an array list to another array list.
    public ArrayList<String> q16(ArrayList<String> list){
        ArrayList<String> list2 = new ArrayList<>();
        for (int i=0; i<list.size();i++){
            list2.add(list.get(i));

        }

        // Second way using clone:
        // ArrayList<String> list2 = (ArrayList<String>) list.clone();
        return list2;
    }


}

