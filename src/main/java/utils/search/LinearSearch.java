package utils.search;

public class LinearSearch {

    /**
     * Perform linear search to find the target element in the array.
     * @param <T> the type of elements in the array
     * @param array the array to search
     * @param target the target element to find
     * @return the index of the target element, or -1 if not found
     */
    public static <T> int search(final T[] array, final T target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }
}
