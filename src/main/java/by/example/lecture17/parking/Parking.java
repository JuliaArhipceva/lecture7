package by.example.lecture17.parking;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Parking {

    private static final int MAX_COUNT = 2;
    private static final Semaphore SEMAPHORE = new Semaphore(MAX_COUNT, true);

    public void tryPark(Car car) {
        try {
            System.out.println("Car " + car.getName() +
                    " tries to park and will wait for max " + car.getMaxWaitTime() + " milliseconds.");
            boolean isSuccessful = SEMAPHORE.tryAcquire(car.getMaxWaitTime(), TimeUnit.MILLISECONDS);
            if (isSuccessful) {
                car.park();
                SEMAPHORE.release();
                System.out.println("Car " + car.getName() + " left parking.");
            } else {
                System.out.println("Car " + car.getName() + " is not parked.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
