package SMSusingCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap_using h = new HashMap_using();

        Set<String> s1 = new HashSet<>(Arrays.asList("Java", "Python"));
        h.addNewStudent(10,"Aiatulla",19,s1);
        System.out.println("\n");

        Set<String> s2 = new HashSet<>(Arrays.asList("Java", "C++"));
        h.addNewStudent(15,"Aktan",18,s2);
        System.out.println("\n");

        System.out.println("All added sdudents:");
        h.displayStudents();
        System.out.println("\n");

        System.out.println("Update sdudents details:");
        h.search(15);
        System.out.println("After updating");
        Set<String> s3 = new HashSet<>(Arrays.asList("Java","PHP", "C++"));
        h.updateStudentDetails(15,"Aktan",17,s3);
        h.search(15);
        System.out.println("\n");

        System.out.println("Searching student with id:10");
        h.search(10);
        System.out.println("\n");

        System.out.println("List off all students with spesific course, for examp Java:");
        h.sameCourseStudents("Java");
        System.out.println("\n");

        System.out.println("Remove student with id:10 and update");
        h.removeStudent(10);
        h.displayStudents();
        System.out.println("\n");

        System.out.println("Sorting students with using TreeSet:");
        h.sortedByName();






    }
}
