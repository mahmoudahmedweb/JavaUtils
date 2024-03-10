package utils.datastructure;

public class QueueLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

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

    public T peek() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return front.data;
    }
}
