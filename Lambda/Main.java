package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.BiFunction;

interface Predicate {
    List<Integer> oddNums(List<Integer> l);
}

interface SortList {
    List<String> sortList(List<String> sl);
}

public class Main {
    public static void main(String[] args) {
        MathOperations addition = (a, b) -> a + b;
        MathOperations subtraction = (a, b) -> a - b;
        MathOperations multiplication = (a, b) -> a * b;
        MathOperations division = (a, b) -> b != 0 ? a / b : 0;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));

        Predicate pr = (num) -> {
            List<Integer> arr = new ArrayList<>();
            for (Integer el : num) {
                if (el % 2 != 0) {
                    arr.add(el);
                }
            }
            return arr;
        };

        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);
        System.out.println("Odd Numbers: " + pr.oddNums(numbers));

        SortList sl = (list) -> {
            List<String> sortedList = new ArrayList<>(list);
            Collections.sort(sortedList);
            return sortedList;
        };

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println("Sorted List: " + sl.sortList(names));

        Function<String, String> transformString = (str) -> {
            String upperc = str.toUpperCase();
            StringBuilder reversed = new StringBuilder();
            for (int i = upperc.length() - 1; i >= 0; i--) {
                reversed.append(upperc.charAt(i));
            }
            return reversed.toString();
        };

        List<String> words = Arrays.asList("hello", "java", "lambda");
        List<String> transformedWords = new ArrayList<>();
        for (String word : words) {
            transformedWords.add(transformString.apply(word));
        }

        System.out.println("Transformed Strings: " + transformedWords);

        Consumer<String> printElement = (element) -> System.out.println(element);
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        System.out.println("Cities:");
        cities.forEach(printElement);

        System.out.println("Cities (Method Reference):");
        cities.forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> findLarger = (a, b) -> a > b ? a : b;
        BiFunction<Integer, Integer, Integer> findSmaller = (a, b) -> a < b ? a : b;

        int a = 25, b = 40;
        System.out.println("Max: " + findLarger.apply(a, b));
        System.out.println("Min: " + findSmaller.apply(a, b));
    }
}
