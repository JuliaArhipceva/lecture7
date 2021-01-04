package by.example.lecture16.pc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    private static final Random random = new Random();
    public static final int TOTAL_COUNT = 100;

    public static void main(String[] args) throws InterruptedException {

        ProducerConsumer pc = new ProducerConsumer();

        Runnable producingRunnable = () -> pc.produce();
        Runnable consumingRunnable = () -> pc.consume();

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

//        for (int i = 0; i < TOTAL_COUNT; i++) {
//            int randomInt = random.nextInt(100);
//            if (randomInt % 2 == 0) {
//                pc.produce();
//            } else {
//                pc.consume();
//            }
//        }

    }

}
