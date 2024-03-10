package utils.datastructure;

import utils.datastructure.QueueLinkedList;

public class QueueLinkedListTest {
    public static void main(String[] args) {
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Test dequeue and peek operations

        System.out.println("Dequeue: " + queue.dequeue()); // Should print 1
        System.out.println("Peek: " + queue.peek()); // Should print 2


        // Test size and isEmpty operations
        System.out.println("Size: " + queue.size()); // Should print 2
        System.out.println("Is Empty: " + queue.isEmpty()); // Should print false

        // Dequeue remaining elements

            System.out.println("Dequeue: " + queue.dequeue()); // Should print 2
            System.out.println("Dequeue: " + queue.dequeue()); // Should print 3


        // Test size and isEmpty after dequeueing all elements
        System.out.println("Size: " + queue.size()); // Should print 0
        System.out.println("Is Empty: " + queue.isEmpty()); // Should print true

        // Try to dequeue from empty queue (should throw EmptyQueueException)

        System.out.println("Dequeue: " + queue.dequeue());


    }
}