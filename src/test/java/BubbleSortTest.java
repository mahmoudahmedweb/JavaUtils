import utils.sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 7};
        System.out.println("Original array: " + Arrays.toString(intArray));
        BubbleSort<Integer> intSorter = new BubbleSort<>();
        intSorter.bubbleSort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }
}
