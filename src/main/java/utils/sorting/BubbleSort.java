package utils.sorting;

/**
 * Implementation of the Bubble Sort algorithm for sorting
 * arrays of Comparable elements.
 * Bubble sort repeatedly steps through the list, compares
 * adjacent elements, and swaps them if they are in the wrong order.
 * The pass through the list is repeated until the list is sorted.
 * @param <T> the type of elements in the array, must implement the
 * Comparable interface
 */
public class BubbleSort<T extends Comparable<T>> {

    /**
     * Sorts the input array using the Bubble Sort algorithm.
     * @param arr the array to be sorted
     */
    public void bubbleSort(final T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
