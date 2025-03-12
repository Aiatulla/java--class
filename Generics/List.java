package Generics;

import java.util.ArrayList;
import java.util.List;

class ListGenerics<T> {
    private List<T> list;

    public ListGenerics(List<T> list1, List<T> list2) {
        list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
    }

    public void display() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5));
        List<Integer>  list2 = new ArrayList<>(List.of(2, 4, 6, 8));
        ListGenerics<Integer> intMerger = new ListGenerics<>(list1, list2);
        intMerger.display();

    }
}


