package by.example.lecture11.optional;

import java.util.Optional;
import java.util.Random;

public class Example11Optional {

    public static void main(String[] args) {

        Integer integerValue = 17;
        int intValue = 0;
        Integer integerNullValue = null;

        Optional<Integer> integerOptional = Optional.of(integerValue);
        Optional<Integer> intOptional = Optional.of(intValue);
//        Optional<int> intOptional1 = Optional.of(intValue); // not allowed
//        Optional<Integer> integerNullOptional = Optional.of(integerNullValue); // not allowed

        Optional<Integer> integerOptionalOfNullable = Optional.ofNullable(integerValue);
        Optional<Integer> integerNullOptionalOfNullable = Optional.ofNullable(integerNullValue);

        Optional<Object> empty = Optional.empty();


        System.out.println("integerOptional.get() = " + integerOptional.get());
        System.out.println("intOptional.get() = " + intOptional.get());
        System.out.println("integerOptionalOfNullable.get() = " + integerOptionalOfNullable.get());
//        System.out.println("integerNullOptionalOfNullable.get() = " + integerNullOptionalOfNullable.get()); // not allowed
//        System.out.println("empty.get() = " + empty.get()); // not allowed

        System.out.println("integerOptional.isPresent() = " + integerOptional.isPresent());
        System.out.println("intOptional.isPresent() = " + intOptional.isPresent());
        System.out.println("integerOptionalOfNullable.isPresent() = " + integerOptionalOfNullable.isPresent());
        System.out.println("integerNullOptionalOfNullable.isPresent() = " + integerNullOptionalOfNullable.isPresent());
        System.out.println("empty.isPresent() = " + empty.isPresent());

        integerOptional.ifPresent(str -> System.out.println("integerOptional"));
        intOptional.ifPresent(str -> System.out.println("intOptional"));
        integerOptionalOfNullable.ifPresent(str -> System.out.println("integerOptionalOfNullable"));
        integerNullOptionalOfNullable.ifPresent(str -> System.out.println("integerNullOptionalOfNullable"));
        empty.ifPresent(str -> System.out.println("empty"));

        System.out.println("integerOptional.orElse(7) = " + integerOptional.orElse(7));
        System.out.println("intOptional.orElse(7) = " + intOptional.orElse(7));
        System.out.println("integerOptionalOfNullable.orElse(7) = " + integerOptionalOfNullable.orElse(7));
        System.out.println("integerNullOptionalOfNullable.orElse(7) = " + integerNullOptionalOfNullable.orElse(7));
        System.out.println("empty.orElse(7) = " + empty.orElse(7));

        Random random = new Random();

        System.out.println("integerOptional.orElseGet = " + integerOptional.orElseGet(() -> random.nextInt(10) + 1));
        System.out.println("intOptional.orElseGet = " + intOptional.orElseGet(() -> random.nextInt(10) + 1));
        System.out.println("integerOptionalOfNullable.orElseGet = " + integerOptionalOfNullable.orElseGet(() -> random.nextInt(10) + 1));
        System.out.println("integerNullOptionalOfNullable.orElseGet = " + integerNullOptionalOfNullable.orElseGet(() -> random.nextInt(10) + 1));
        System.out.println("empty.orElseGet = " + empty.orElseGet(() -> random.nextInt(10) + 1));

        System.out.println("integerOptional.map = " + integerOptional.map(integer -> integer + 10));
        System.out.println("intOptional.map = " + intOptional.map(integer -> integer + 10));
        System.out.println("integerOptionalOfNullable.map = " + integerOptionalOfNullable.map(integer -> integer + 10));
        System.out.println("integerNullOptionalOfNullable.map = " + integerNullOptionalOfNullable.map(integer -> integer + 10));
//        System.out.println("empty.map = " + empty.map(integer -> integer + 10)); // not allowed

        integerOptional.orElseThrow(() -> new NullPointerException("message"));
        intOptional.orElseThrow(() -> new NullPointerException("message"));
        integerOptionalOfNullable.orElseThrow(() -> new NullPointerException("message"));
//        integerNullOptionalOfNullable.orElseThrow(() -> new NullPointerException("message")); // exception
//        empty.orElseThrow(() -> new NullPointerException("message")); // exception

    }

}
