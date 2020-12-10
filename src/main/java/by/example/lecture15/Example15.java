package by.example.lecture15;

import java.util.Arrays;

public class Example15 {

    public static void main(String[] args) throws InterruptedException {

        Thread currentThread = Thread.currentThread();
        System.out.println("id: " + currentThread.getId());
        System.out.println("name: " + currentThread.getName());
        System.out.println("priority: " + currentThread.getPriority());
        System.out.println("stack trace: " + currentThread.getStackTrace());
        System.out.println("state: " + currentThread.getState());
        System.out.println("thread group: " + currentThread.getThreadGroup());

        System.out.println("Thread is interrupted: " + Thread.interrupted());
//        System.out.println("Thread is interrupted: " + currentThread.isInterrupted());
        System.out.println("Thread is alive: " + currentThread.isAlive());
        currentThread.interrupt();
        System.out.println("Thread is interrupted: " + Thread.interrupted());
//        System.out.println("Thread is interrupted: " + currentThread.isInterrupted());
        System.out.println("state: " + currentThread.getState());
        System.out.println("Thread is alive: " + currentThread.isAlive());

//        currentThread.run();

//        currentThread.start(); // NEW -> RUNNABLE


    }

    private static void showStaticMethods() throws InterruptedException {
        int estimatedActiveCount = Thread.activeCount();
        System.out.println(estimatedActiveCount);

        Thread thread = Thread.currentThread();
        System.out.println(thread);

        Thread.dumpStack();

        Thread[] threads = new Thread[estimatedActiveCount];
        Thread.enumerate(threads);
        Arrays.stream(threads).forEach(System.out::println);

        System.out.println();

        System.out.println("interrupted: " + Thread.interrupted());

        System.out.println("Thread goes to sleep");
        Thread.sleep(5000);
        System.out.println("Thread wakes up");
    }

}
