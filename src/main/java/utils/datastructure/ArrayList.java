package utils.datastructure;

import java.util.Arrays;

/**
 * A generic ArrayList implementation.
 * @param <T> the type of elements in the ArrayList
 */
public class ArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    /**
     * Constructs an empty ArrayList with default capacity.
     */
    public ArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Constructs an empty ArrayList with the specified initial capacity.
     * @param initialCapacity the initial capacity of the ArrayList
     */
    public ArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be positive");
        }
        array = new Object[initialCapacity];
        size = 0;
    }

    /**
     * Returns the number of elements in the ArrayList.
     * @return the number of elements
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the ArrayList is empty.
     * @return true if the ArrayList is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Adds an element to the end of the ArrayList.
     * @param item the element to add
     */
    public void add(T item) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        array[size++] = item;
    }

    /**
     * Returns the element at the specified index in the ArrayList.
     * @param index the index of the element to return
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        return (T) array[index];
    }

    // Resizes the underlying array to the specified capacity
    private void resize(int capacity) {
        array = Arrays.copyOf(array, capacity);
    }
}
