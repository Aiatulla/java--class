package Exercises;
import java.util.TreeSet;

public class TreeSetQ {

    // 11. Write a Java program to get the element in a tree set less than or equal to the given element.
    public void q11(TreeSet<Integer> ts, int element){
        System.out.println(ts.floor(element));
    }

    // 12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
    public void q12(TreeSet<Integer> ts, int element){
        System.out.println(ts.ceiling(element));
    }

    // 13. Write a Java program to get an element in a tree set that has a lower value than the given element.
    public void q13(TreeSet<Integer> ts, int element){
        System.out.println(ts.lower(element));
    }

    // 14. Write a Java program to retrieve and remove the first element of a tree set.
    public void q14(TreeSet<Integer> ts){
        System.out.println(ts.pollFirst());
    }

    // 15. Write a Java program to retrieve and remove the last element of a tree set.
    public void q15(TreeSet<Integer> ts){
        System.out.println(ts.pollLast());
    }

    // 16. Write a Java program to remove a given element from a tree set.
    public void q16(TreeSet<Integer> ts, int element){
        boolean removed = ts.remove(element);
        if(removed) {
            System.out.println("Element " + element + " removed from the TreeSet.");
        } else {
            System.out.println("Element " + element + " not found in the TreeSet.");
        }
    }
}

