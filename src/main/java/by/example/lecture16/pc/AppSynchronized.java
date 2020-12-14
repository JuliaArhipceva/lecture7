package by.example.lecture16.pc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppSynchronized {

    private static final Random random = new Random();
    public static final int TOTAL_COUNT = 100;

    public static void main(String[] args) throws InterruptedException {

        ProducerConsumerSynchronized pc = new ProducerConsumerSynchronized();

        Runnable producingRunnable = () -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable consumingRunnable = () -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        List<Thread> producingThreads = new ArrayList<>();
        for (int i = 0; i < TOTAL_COUNT; i++) {
            producingThreads.add(new Thread(producingRunnable));
        }

        List<Thread> consumingThreads = new ArrayList<>();
        for (int i = 0; i < TOTAL_COUNT; i++) {
            consumingThreads.add(new Thread(consumingRunnable));
        }

        producingThreads.forEach(Thread::start);
        consumingThreads.forEach(Thread::start);

        for (int i = 0; i < TOTAL_COUNT; i++) {
            producingThreads.get(i).join();
            consumingThreads.get(i).join();
        }

    }

}
