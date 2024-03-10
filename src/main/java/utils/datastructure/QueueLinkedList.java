package utils.datastructure;

/**
 * A generic queue implementation using a linked list.
 * @param <T> the type of elements in the queue
 */
public class QueueLinkedList<T> {
    /**
     * Represents a node in the linked list.
     * @param <T> the type of data stored in the node
     */
    private static class Node<T> {
        /**
         * The data stored in the node.
         */
        private T data;
        /**
         * Reference to the next node in the linked list.
         */
        private Node<T> next;

        /**
         * Constructs a node with the specified data.
         * @param data the data to store in the node
         */
        Node(final T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Points to the front of the queue.
     */
    private Node<T> front;

    /**
     * Points to the rear of the queue.
     */
    private Node<T> rear;

    /**
     * Number of elements in the queue.
     */
    private int size;


    /**
     * Constructs an empty queue.
     */
    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    /**
     * Returns the number of elements in the queue.
     * @return the number of elements
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Adds an element to the rear of the queue.
     * @param item the element to enqueue
     */
    public void enqueue(final T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    /**
     * Removes and returns the element at the front of the queue.
     * @return the element at the front of the queue
     * @throws EmptyQueueException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        T item = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return item;
    }

    /**
     * Returns the element at the front of the queue without removing it.
     * @return the element at the front of the queue
     * @throws EmptyQueueException if the queue is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return front.data;
    }
}
