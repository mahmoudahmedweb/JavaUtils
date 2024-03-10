package utils.sorting;

import utils.sorting.SelectionSort;
import java.util.Arrays;

public class SelectionSortTest {
    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 7};
        System.out.println("Original array: " + Arrays.toString(intArray));
        SelectionSort<Integer> intSorter = new SelectionSort<>();
        intSorter.selectionSort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }
}