package by.example.lecture15.threads;

public class AppImplementingRunnable {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread is run");

        Runnable runnable = new MyRunnable();

        // analog of MyRunnable class
//        runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("MyRunnable is run!");
//            }
//
//        };

        // analog of MyRunnable with lambda
//        runnable = () -> System.out.println("MyRunnable is run!");

//        runnable.run(); // will not start new thread

//        Thread thread = new Thread(runnable); // way to create thread using existing runnable

//        thread.run(); // will not start new thread

//        Thread thread = new Thread(() -> System.out.println("MyRunnable is run!"));
//        thread.start(); will start new thread, but we don't need it anymore because of MyRunnable constructor

//        Thread.sleep(5000);

        System.out.println("Main thread is finished");

    }

}
