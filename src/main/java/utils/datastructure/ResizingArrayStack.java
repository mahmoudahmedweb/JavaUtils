package utils.datastructure;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * A generic stack implementation using a resizing array.
 * @param <T> the type of elements in the stack
 */
public class ResizingArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size;

    /**
     * Constructs an empty stack with default capacity.
     */
    public ResizingArrayStack() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Constructs an empty stack with the specified initial capacity.
     * @param initialCapacity the initial capacity of the stack
     */
    public ResizingArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be positive");
        }
        array = (T[]) new Object[initialCapacity];
        size = 0;
    }

    /**
     * Returns the number of elements in the stack.
     * @return the number of elements
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param item the element to push
     */
    public void push(T item) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        array[size++] = item;
    }

    /**
     * Removes and returns the element at the top of the stack.
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = array[--size];
        array[size] = null; // Avoid memory leak
        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }
        return item;
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[size - 1];
    }

    // Resizes the underlying array to the specified capacity
    private void resize(int capacity) {
        array = Arrays.copyOf(array, capacity);
    }
}
