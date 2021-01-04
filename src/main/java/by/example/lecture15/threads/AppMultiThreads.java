package by.example.lecture15.threads;

import java.util.ArrayList;
import java.util.List;

public class AppMultiThreads {

    public static void main(String[] args) {

        System.out.println("start");

        List<Thread> threads = new ArrayList<>();
        threads.add(new MyThread("thread-1"));
        threads.add(new MyThread("thread-2"));
        threads.add(new MyThread("thread-3"));

        threads.forEach(thread -> thread.start());

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("stop");

    }

}
