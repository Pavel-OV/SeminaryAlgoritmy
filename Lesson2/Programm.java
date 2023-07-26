package Lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class Programm {
    public static void main(String[] args) {
        int[] array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        // SortUtils.directArray(array);
        // ArrayUtils.printArray(array);
        System.out.println();
        HeapSort.sort(array);
        // SortUtils.quickSort(array);
        ArrayUtils.printArray(array);

        // array = new int[]{9,5,3,7};
        // SortUtils.quickSort(array);
        // ArrayUtils.printArray(array);
        // int[] array2 = ArrayUtils.prepareArray(100000);
        // long startTime = System.currentTimeMillis();
        // SortUtils.directArray(array2.clone());
        // long endTime = System.currentTimeMillis();
        // System.out.printf("Время соритировкм по методу directArray %d mc",(endTime -
        // startTime));
        // startTime = System.currentTimeMillis();
        // SortUtils.quickSort(array2.clone());
        // endTime = System.currentTimeMillis();
        // System.out.printf("\n Время соритировкм по методу quickSort %d mc",(endTime -
        // startTime));
        // startTime = System.currentTimeMillis();
        // Arrays.sort(array2.clone());
        // endTime = System.currentTimeMillis();
        // System.out.printf("\n Время соритировкм по встроенному методу %d mc",(endTime
        // - startTime));
        // int[] array3 = new int[] {-5,-10,5,9,4,-7,-9,-4,9,8};
        // ArrayUtils.printArray(array3);
        // SortUtils.quickSort(array3);
        // ArrayUtils.printArray(array3);
        // int searchElement = 5;
        // int res = SearchUtils.binarySearch(searchElement,array3);

        // System.out.printf("Элемент %d найден в массиве по индексу
        // %d",searchElement,res );
        
    }
}
