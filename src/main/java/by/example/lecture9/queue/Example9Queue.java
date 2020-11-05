package by.example.lecture9.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Example9Queue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(5);
        queue.add(7);
        queue.add(3);
        queue.forEach(System.out::println);

//        queue.add(null); // exception
//        queue.offer(null); // exception

        System.out.println("queue.element() = " + queue.element());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.element() = " + queue.element());

        for (int i = 0; i < 3; i++) {
            System.out.println("queue.remove() = " + queue.remove());
        }
//        queue.remove(); // exception
        System.out.println(queue.poll()); // null

//        System.out.println(queue.element()); // exception
        System.out.println(queue.peek()); // null

    }

}
