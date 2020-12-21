package by.example.lecture17.parking;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static final int CAR_COUNT = 10;
    public static Parking PARKING = new Parking();

    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(CAR_COUNT);

        for (int i = 0; i < CAR_COUNT; i++) {
            executor.submit(new Car("#" + i,
                    RANDOM.nextInt(1000), RANDOM.nextInt(1000)));
        }

        Thread.sleep(5000);

        for (int i = 10; i < 100; i++) {
            executor.submit(new Car("#" + i, RANDOM.nextInt(1000), RANDOM.nextInt(1000)));
        }

        executor.shutdown();
    }

}
