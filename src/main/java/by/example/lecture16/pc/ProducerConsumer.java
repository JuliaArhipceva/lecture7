package by.example.lecture16.pc;

import java.util.*;

public class ProducerConsumer {

    private Set<Integer> products = new HashSet<>();
    private static final Random random = new Random();
    private static final Integer MAX_COUNT = 10;

    public void produce() {
        int product = random.nextInt(100);
        if (products.size() < MAX_COUNT) {
            products.add(product);
        } else {
            throw new RuntimeException("Limit was reached.");
        }
        System.out.println("Product was produced: " + product);
    }

    public void consume() {
        Integer randomProduct = getRandomProduct();
        System.out.println("Product was consumed: " + randomProduct);
    }

    private Integer getRandomProduct() {

        List<Integer> integers = new ArrayList<>(products);
        int size = integers.size();
        if (size == 0) {
            throw new RuntimeException("No products to consume.");
        }

        int index = 0;
        if (size != 1) {
            index = random.nextInt(size);
        }
        Integer integerToRemove = integers.get(index);
        products.remove(integerToRemove);

        return integerToRemove;
    }

}
