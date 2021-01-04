package by.example.lecture16.counter;

public class Counter {

    private static Integer totalCount = 0;
    private static Object lock = new Object();

    public static void increment() {
        synchronized (lock) {
            totalCount++;
        }
    }

    public static Integer getTotalCount() {
        return totalCount;
    }

//    way to synchronize on instance of class

//    public void increment() {
//        synchronized (this) {
//            totalCount++; // if totalCount is not static
//        }
//    }

//    way to synchronize on object of class (type Class)
//
//    public synchronized static void increment() {
//        totalCount++;
//    }

//    way without synchronization
//
//    private volatile static Integer totalCount = 0;
//
//    public static void increment() {
//        totalCount++;
//    }
//
//    public static Integer getTotalCount() {
//        return totalCount;
//    }

}
