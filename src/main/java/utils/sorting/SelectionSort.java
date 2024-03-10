package utils.sorting;

/**
 * Implementation of the Selection Sort algorithm for sorting arrays
 * of Comparable elements.
 * Selection sort repeatedly finds the minimum element from the
 * unsorted part of the array and moves it to the beginning.
 * @param <T> the type of elements in the array, must implement the
 * Comparable interface
 */
public class SelectionSort<T extends Comparable<T>> {

    /**
     * Sorts the input array using the Selection Sort algorithm.
     * @param arr the array to be sorted
     */
    public void selectionSort(final T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
