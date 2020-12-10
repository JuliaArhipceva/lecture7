package by.example.lecture15.threads;

public class MyRunnable implements Runnable {

    public MyRunnable() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("MyRunnable is run!");
    }

}
