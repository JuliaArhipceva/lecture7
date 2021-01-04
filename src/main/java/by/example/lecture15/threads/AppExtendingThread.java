package by.example.lecture15.threads;

public class AppExtendingThread {

    public static void main(String[] args) {

        System.out.println("Main thread is run");

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("My thread is run!");
            }
        };

        thread.start();

        System.out.println("Main thread is finished");

    }

}
