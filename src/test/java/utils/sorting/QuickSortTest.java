package utils.sorting;

import utils.sorting.QuickSort;
import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 7};
        System.out.println("Original array: " + Arrays.toString(intArray));
        QuickSort<Integer> intSorter = new QuickSort<>();
        intSorter.quickSort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }
}

