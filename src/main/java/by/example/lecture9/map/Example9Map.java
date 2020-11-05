package by.example.lecture9.map;

import java.util.*;

public class Example9Map {

    private static final String NAME1 = "Name1";
    private static final String NAME2 = "Name2";
    private static final String NAME3 = "Name3";
    public static final int PHONE1 = 67567;
    public static final int PHONE2 = 768;
    public static final int PHONE3 = 9808;

    public static void main(String[] args) {

        Map<String, Integer> phoneNumbers = new HashMap<>();

        phoneNumbers.put(NAME1, PHONE1);
        phoneNumbers.put(NAME2, PHONE2);
        phoneNumbers.put(NAME3, PHONE3);

        System.out.println("for each");
        phoneNumbers.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("iteration on key set");
        for (String key : phoneNumbers.keySet()) {
            System.out.println(key + ": " + phoneNumbers.get(key));
        }

        System.out.println("phoneNumbers.containsKey(NAME) = " + phoneNumbers.containsKey(NAME1));
        System.out.println("phoneNumbers.containsKey(dfdg) = " + phoneNumbers.containsKey("dfdg"));
        System.out.println("phoneNumbers.containsValue(PHONE) = " + phoneNumbers.containsValue(PHONE1));
        System.out.println("phoneNumbers.containsValue(774) = " + phoneNumbers.containsValue(774));

        System.out.println("map get: " + phoneNumbers.get(NAME1));
        System.out.println("map get or default: " + phoneNumbers.getOrDefault("dfgd", 17));

        System.out.println("putAll");
        Map<String, Integer> copy = new HashMap<>();
        copy.putAll(phoneNumbers);
        copy.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("putIfAbsent");
        phoneNumbers.putIfAbsent(NAME1, 1);
        System.out.println(phoneNumbers.get(NAME1));
        phoneNumbers.put(NAME1, null);
        System.out.println(phoneNumbers.get(NAME1));
        phoneNumbers.putIfAbsent(NAME1, 1);
        System.out.println(phoneNumbers.get(NAME1));

//        System.out.println("remove (before)");
//        copy.forEach((key, value) -> System.out.println(key + ": " + value));
//        copy.remove(NAME1);
//        System.out.println("remove (after)");
//        copy.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("remove (before)");
        copy.forEach((key, value) -> System.out.println(key + ": " + value));
        boolean remove = copy.remove(NAME1, PHONE1);
        System.out.println("remove (after)");
        System.out.println("remove = " + remove);
        copy.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("clear (before)");
        copy.forEach((key, value) -> System.out.println(key + ": " + value));
        copy.clear();
        System.out.println("clear (after)");
        copy.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("replace");
        phoneNumbers.forEach((key, value) -> System.out.println(key + ": " + value));
        phoneNumbers.replace(NAME1, 56077896);
        phoneNumbers.forEach((key, value) -> System.out.println(key + ": " + value));

        Collection<Integer> values = phoneNumbers.values();
        for (Integer value : values) {
            System.out.println("value: " + value);
        }

        SortedMap<String, String> abc = new TreeMap<>();
        abc.put("c", "ц");
        abc.put("e", "е");
        abc.put("a", "а");
        abc.put("d", "д");
        abc.put("b", "б");
        abc.forEach((key, value) -> System.out.println(key + ": " + value));

        Comparator<? super String> comparator = abc.comparator();

        System.out.println("first key: " + abc.firstKey());
        System.out.println("last key: " + abc.lastKey());

        System.out.println("head map");
        abc.headMap("c").forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("sub map");
        abc.subMap("b", "d").forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("tail map");
        abc.tailMap("d").forEach((key, value) -> System.out.println(key + ": " + value));


    }

}
