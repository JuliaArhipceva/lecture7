package by.example.lecture17.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private static AtomicInteger totalCount = new AtomicInteger(0);

    public static void increment() {
        totalCount.incrementAndGet();
    }

    public static Integer getTotalCount() {
        return totalCount.get();
    }

}
