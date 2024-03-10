package utils.sorting;

/**
 * Implementation of the Merge Sort algorithm for sorting
 * arrays of Comparable elements.
 * Merge sort is a divide-and-conquer algorithm that divides
 * the input array into two halves, sorts each half recursively,
 * and then merges the sorted halves.
 * @param <T> the type of elements in the array, must implement
 * the Comparable interface
 */
public class MergeSort<T extends Comparable<T>> {

    /**
     * Sorts the input array using the Merge Sort algorithm.
     * @param arr the array to be sorted
     */
    public void sort(final T[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * Recursively sorts the subarray of the input array.
     * @param arr the array to be sorted
     * @param low the index of the first element of the subarray
     * @param high the index of the last element of the subarray
     */
    private void mergeSort(final T[] arr, final int low, final int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            // Sort first and second halves
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            // Merge the sorted halves
            merge(arr, low, mid, high);
        }
    }

    /**
     * Merges two sorted subarrays into one sorted subarray.
     * @param arr the array containing the subarrays to be merged
     * @param low the index of the first element of the first subarray
     * @param mid the index of the last element of the first subarray
     * @param high the index of the last element of the second subarray
     */
    private void merge(final T[] arr, final int low,
                       final int mid, final int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temporary arrays
        T[] leftArray = (T[]) new Comparable[n1];
        T[] rightArray = (T[]) new Comparable[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[low + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0;
        int j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
