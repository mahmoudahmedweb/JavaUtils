package utils.datastructure;

import java.util.EmptyStackException;

/**
 * A simple implementation of a stack using a linked list.
 *
 * @param <T> the type of elements stored in the stack
 */
public class StackLinkedList<T> {
    private Node<T> top; // Top of the stack
    private int size;    // Size of the stack

    /**
     * Constructs an empty stack.
     */
    public StackLinkedList() {
        top = null;
        size = 0;
    }

    /**
     * Pushes an element onto the top of this stack.
     *
     * @param data the element to push onto the stack
     */
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    /**
     * Removes the element at the top of this stack and returns it.
     *
     * @return the element removed from the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    /**
     * Returns the element at the top of this stack without removing it.
     *
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return the number of elements in the stack
     */
    public int size() {
        return size;
    }

    /**
     * Represents a node in the linked list.
     */
    private static class Node<T> {
        private T data;       // Data stored in the node
        private Node<T> next; // Reference to the next node

        /**
         * Constructs a node with the given data.
         *
         * @param data the data to store in the node
         */
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
