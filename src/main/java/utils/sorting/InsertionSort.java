package utils.sorting;

/**
 * Implementation of the Insertion Sort algorithm for sorting
 * arrays of Comparable elements.
 * Insertion sort is a simple sorting algorithm that builds
 * the final sorted array one element at a time.
 * It iterates through the input array and repeatedly removes
 * one element and inserts it into the correct position in
 * the sorted part of the array.
 * The time complexity of insertion sort is O(n^2) in the worst case،
 * but it performs efficiently on small arrays.
 * @param <T> the type of elements in the array,
 * must implement the Comparable interface
 */
public class InsertionSort<T extends Comparable<T>> {

    /**
     * Sorts the input array using the Insertion Sort algorithm.
     * @param arr the array to be sorted
     */
    public void sort(final T[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
