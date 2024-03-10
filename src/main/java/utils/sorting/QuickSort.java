package utils.sorting;

/**
 * Implementation of the Quick Sort algorithm for sorting arrays of Comparable elements.
 * Quick sort is a divide-and-conquer algorithm that partitions the array into two subarrays, then recursively sorts each subarray.
 * It's an efficient sorting algorithm with an average time complexity of O(n log n).
 * @param <T> the type of elements in the array, must implement the Comparable interface
 */
public class QuickSort<T extends Comparable<T>> {

    /**
     * Sorts the input array using the Quick Sort algorithm.
     * @param arr the array to be sorted
     */
    public void quickSort(T[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * Recursively sorts the subarray of the input array.
     * @param arr the array to be sorted
     * @param low the index of the first element of the subarray
     * @param high the index of the last element of the subarray
     */
    private void quickSort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Partitions the input array into two subarrays, placing elements smaller than the pivot to the left and elements larger than the pivot to the right.
     * @param arr the array to be partitioned
     * @param low the index of the first element of the subarray
     * @param high the index of the last element of the subarray
     * @return the index of the pivot element after partitioning
     */
    private int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
