package by.example.lecture9.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Example9List {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("bird");
        words.add("cat");
        words.add("cat");
        words.add("dog");
        printList(words);

        System.out.println("element at index 1: " + words.get(1));
        words.set(1, "DOG");
        System.out.println("element at index 1: " + words.get(1));

        System.out.println("words.indexOf(\"cat\"): " + words.indexOf("cat")); // 0
        System.out.println("words.lastIndexOf(\"cat\"): " + words.lastIndexOf("cat")); // 4

        System.out.println("compare by unusual");
        Comparator<String> comparatorUnusual = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals("cat")) {
                    return -101289283;
                }
                return o1.compareTo(o2);
            }
        };
        words.sort(comparatorUnusual);
        printList(words);

        System.out.println("compare by usual");
        Comparator<String> comparatorUsual = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        words.sort(comparatorUsual);
        printList(words);

    }

    private static void printList(List<String> words) {
        words.forEach(System.out::println);
    }

}
