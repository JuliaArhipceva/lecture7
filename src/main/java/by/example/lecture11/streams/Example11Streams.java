package by.example.lecture11.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example11Streams {

    private static Random RANDOM = new Random();

    public static void main(String[] args) {

        List<String> words = Arrays.asList("cat", "dog", "car", "window", "mood", "cat");

        List<Character> collectedChars = words.stream()
                .flatMap(word -> Arrays.stream(box(word.toCharArray())))
                .collect(Collectors.toList());
        collectedChars.forEach(System.out::println);

    }

    private static Character[] box(char[] charArray) {
        Character[] result = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            result[i] = Character.valueOf(charArray[i]);
        }
        return result;
    }

    ;

    private static void showFilter() {
        List<String> words = Arrays.asList("cat", "dog", "car", "window", "mood", "cat");

        words.stream()
                .filter(word -> word.length() > 3)
                .forEach(System.out::println);

        words.forEach(System.out::println);
    }

    private static void showConcat() {
        List<String> words = Arrays.asList("cat", "dog", "car", "window", "mood", "cat");
        System.out.println("words:");
        words.forEach(System.out::println);

        System.out.println("distinct stream:");
        Stream<String> distinctStream = words.stream().distinct();
//        distinctStream.forEach(System.out::println);

        System.out.println("additional stream:");
        Stream<String> additionalStream = Stream.of("cat", "dog");
//        additionalStream.forEach(System.out::println);

        System.out.println("concatenated stream:");
        Stream<String> concatenatedStream = Stream.concat(distinctStream, additionalStream);
        concatenatedStream.forEach(System.out::println);
    }

    private static void showMinMax() {
        List<String> words = Arrays.asList("cat", "dog", "car", "window", "mood");

//        System.out.println("max: " + words.stream().max((o1, o2) -> o1.compareTo(o2)).get());
        System.out.println("max: " + words.stream().max(Comparator.naturalOrder()).get());
        System.out.println("min: " + words.stream().min(Comparator.naturalOrder()).get());
    }

    private static void showFind(List<String> words) {
        System.out.println("find first: " + words.stream().findFirst().get());

//        for (int i = 0; i < 100; i++) {
//            System.out.println(i + " time call 'find any': " + words.stream().findAny().get());
//        }
        IntStream.range(0, 100).forEach((i) -> {
            System.out.println(i + " time call 'find any': " + words.stream().findAny().get());
        });
    }

    private static void showCount(List<String> words) {
        System.out.println("words count: " + words.stream().count());
    }

    private static void showAllMatch(List<String> words) {
        boolean areAllWordsLessThanFourSymbols = words.stream().allMatch(word -> word.length() < 4);
        boolean areAllWordsLongerThanTwoSymbols = words.stream().allMatch(word -> word.length() > 2);
        boolean areAllWordsLongerThanRandomCountOfSymbols = words.stream().allMatch(word -> {
            int random = RANDOM.nextInt(2);
            System.out.println("random: " + random);
            return word.length() > random;
        });
        System.out.println("all words are less than 4 symbols: " + areAllWordsLessThanFourSymbols);
        System.out.println("all words are longer than 2 symbols: " + areAllWordsLongerThanTwoSymbols);
        System.out.println("all words are longer than x symbols: " + areAllWordsLongerThanRandomCountOfSymbols);
    }

    private static void showCreation() {
        // 1 way of creation
        List<String> words = Arrays.asList("cat", "dog", "car", "window", "mood");

        Stream<String> stream = words.stream(); // creation - intermediate operation
        Stream<String> sortedStream = stream.sorted(); // sorting - intermediate operation
        List<String> collected = sortedStream.collect(Collectors.toList()); // collecting - terminal operation

        System.out.println("initial list: ");
        words.forEach(System.out::println);

        System.out.println("sorted list: ");
        collected.forEach(System.out::println);

        System.out.println("sorted list second: ");
        List<String> collectedList2 = words.stream()
                .sorted()
                .collect(Collectors.toList());
        collectedList2.forEach(System.out::println);

        // 2 way of creation
        List<String> collectedList3 = Stream.of("book", "apple", "mac")
                .map(str -> str + " modified")
                .collect(Collectors.toList());
        collectedList3.forEach(System.out::println);
    }

}
