package utils.datastructure;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ResizingArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size;

    public ResizingArrayStack() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public ResizingArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be positive");
        }
        array = (T[]) new Object[initialCapacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T item) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        array[size++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = array[--size];
        array[size] = null;
        if (size > 0 && size == array.length / 4) {
            resize(array.length / 2);
        }
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[size - 1];
    }

    private void resize(int capacity) {
        array = Arrays.copyOf(array, capacity);
    }
}
