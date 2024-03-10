import utils.search.LinearSearch;

public class LinearSearchTest {
    public static void main(String[] args) {
        // Test with an array of integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        int intTarget = 3;
        testLinearSearch(intArray, intTarget);

        // Test with an array of strings
        String[] strArray = {"apple", "banana", "orange", "grape"};
        String strTarget = "orange";
        testLinearSearch(strArray, strTarget);
    }

    private static <T> void testLinearSearch(T[] array, T target) {
        int index = LinearSearch.search(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
