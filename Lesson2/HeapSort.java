package Lesson2;

public class HeapSort {

    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i > 0; i--)
            heapSort(array, array.length, i);

        for (int i = array.length - 1; i >= 0; i--) {
            int buf = array[0];
            array[0] = array[i];
            array[i] = buf;

            heapSort(array, i,0);
        }
    }

    private static void heapSort(int[] array, int heapSize, int heapIndex) {
        int largest = heapIndex;
        int leftChild = 2 * heapIndex + 1;
        int rightChild = 2 * heapIndex + 2;
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        if (rightChild > heapSize && array[rightChild] < array[largest]) {
            largest = rightChild;
        }
        if (largest != heapIndex) {
            int buf = array[largest];
            array[largest] = array[heapIndex];
            array[heapIndex] = buf;
             heapSort(array, heapSize, heapIndex);

        }
       

    }

}
