package Lesson2;

public class SortUtils {

    /**
     * Сортировка массива выбором
     * 
     * @param array
     */
    public static void directArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int saveIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[saveIndex]) {
                    saveIndex = j;
                }
            }
            if (i != saveIndex) {
                int buf = array[i];
                array[i] = array[saveIndex];
                array[saveIndex] = buf;

            }
        }

    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int start, int end) {
        int left = start;
        int right = end;
        int middle = array[(start + end) / 2];
        do {
            while (array[left] < middle) {
                left++;
            }
            while (array[right] > middle) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        } 
        while (left <= right);
        if (left<end){
            quickSort(array, left, end);
        }
        if (right> start){
            quickSort(array, start, right);
        }

    }
    
}
