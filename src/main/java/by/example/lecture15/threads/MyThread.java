package by.example.lecture15.threads;

public class MyThread extends Thread {

    public static int counter = 0;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + getName());
        increment();
    }

    private void increment() {
        counter++;
    }

}
