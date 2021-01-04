package by.example.lecture16.pc;

import java.util.*;

public class ProducerConsumerSynchronized {

    private Set<Integer> products = new HashSet<>();
    private static final Random random = new Random();
    private static final Integer MAX_COUNT = 10;

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (products.size() == MAX_COUNT) {
//                    Thread.sleep(1000);
                    wait();
                }
                int product = random.nextInt(100);
                products.add(product);
                System.out.println("Product was produced: " + product);
                notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (products.size() == 0) {
//                    Thread.sleep(1000);
                    wait();
                }
                Integer randomProduct = getRandomProduct();
                System.out.println("Product was consumed: " + randomProduct);
                notify();
            }
        }
    }

    private Integer getRandomProduct() {

        List<Integer> integers = new ArrayList<>(products);
        int size = integers.size();

        int index = 0;
        if (size != 1) {
            index = random.nextInt(size);
        }
        Integer integerToRemove = integers.get(index);
        products.remove(integerToRemove);

        return integerToRemove;

    }

}
