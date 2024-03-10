package utils.search;

public class BinarySearch<T extends Comparable<T>> {
    /**
     * Searches for a target value within a sorted array using the
     * binary search algorithm.
     * @param array The sorted array to search in.
     * @param target The value to search for.
     * @return The index of the target value if found, or -1 if not found.
     */
    public int search(final T[] array, final T target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparisonResult = target.compareTo(array[mid]);
            if (comparisonResult == 0) {
                return mid; // Target found
            } else if (comparisonResult > 0) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return -1; // Target not found
    }
}
