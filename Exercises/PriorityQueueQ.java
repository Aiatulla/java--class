package Exercises;
import java.util.*;

public class PriorityQueueQ {

    // 12. Write a Java program to change priorityQueue to maximum priority queue.
    public void q12(PriorityQueue<Integer> pq) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.addAll(pq);
        System.out.println("Priority Queue changed to maximum priority queue: " + maxPQ);
    }

    // 11. Write a Java program to convert a Priority Queue element to string representations.
    public void q11(PriorityQueue<Integer> pq) {
        String pqString = pq.toString();
        System.out.println("Priority Queue as a string: " + pqString);
    }

    // 10. Write a Java program to convert a priority queue to an array containing all its elements.
    public void q10(PriorityQueue<Integer> pq) {
        Integer[] arr = pq.toArray(new Integer[0]);
        System.out.println("Array of elements from priority queue: " + Arrays.toString(arr));
    }

    // 9. Write a Java program to retrieve and remove the first element.
    public void q9(PriorityQueue<Integer> pq) {
        System.out.println("Removed element (highest priority): " + pq.poll());
    }

    // 8. Write a Java program to retrieve the first element of the priority queue.
    public void q8(PriorityQueue<Integer> pq) {
        System.out.println("First element (highest priority): " + pq.peek());
    }

    // 7. Write a Java program to compare two priority queues.
    public void q7(PriorityQueue<Integer> pq1, PriorityQueue<Integer> pq2) {
        if (pq1.equals(pq2)) {
            System.out.println("The two priority queues are equal.");
        } else {
            System.out.println("The two priority queues are not equal.");
        }
    }
}
