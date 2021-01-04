package by.example.lecture9.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example9Set {

    public static void main(String[] args) {

        Set<String> words = new HashSet<>();

        System.out.println("add values");
        words.add("cat");
        words.add("dog");
        words.add("bird");
        printSet(words);

        System.out.println("addAll");
        Set<String> copy = new HashSet<>();
        copy.addAll(words);
        printSet(copy);

        System.out.println("retainAll");
        Set<String> setToRetain = new HashSet<>();
        setToRetain.add("cat"); // cat
        // cat, dog, bird
        copy.retainAll(setToRetain); // cat
        printSet(copy);
        setToRetain.add("fish"); // cat, fish
        copy.retainAll(setToRetain);
        printSet(copy);

        System.out.println("contains");
        System.out.println("words.contains(\"cat\") = " + words.contains("cat"));
        System.out.println("words.contains(setToRetain) = " + words.containsAll(setToRetain));

        System.out.println("words.isEmpty() = " + words.isEmpty());
        copy.clear();
        System.out.println("copy.isEmpty() = " + copy.isEmpty());

        String[] arrayEnoughSpace = new String[3];
        String[] stringsEnoughSpace = words.toArray(arrayEnoughSpace);
        System.out.println(Arrays.toString(arrayEnoughSpace));

        String[] arrayNotEnoughSpace = new String[1];
        String[] stringsNotEnoughSpace = words.toArray(arrayNotEnoughSpace);
        System.out.println(Arrays.toString(arrayNotEnoughSpace));



    }

    private static void printSet(Set<String> words) {
        words.forEach(System.out::println);
    }

}
