package by.example.lecture16.counter;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();
        Runnable runnable = () -> Counter.increment();

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads.add(new Thread(runnable));
        }

        threads.forEach(Thread::start);

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Counter: " + Counter.getTotalCount());

    }

}
