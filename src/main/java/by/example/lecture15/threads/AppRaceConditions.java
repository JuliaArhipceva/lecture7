package by.example.lecture15.threads;

import java.util.ArrayList;
import java.util.List;

public class AppRaceConditions {

    private static final int THREAD_COUNT = 10000;

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads.add(new MyThread("thread-" + i));
        }

        threads.parallelStream().forEach(thread -> thread.start());

        Thread.sleep(5000);

        System.out.println("counter: " + MyThread.counter);


    }

}
