
package Lesson2;
/**
 * утилиты для работы с массивом
 * 
 */

import java.util.Random;

public class ArrayUtils{

    private static Random rnd = new Random();

public static int[] prepareArray(){
    return prepareArray(rnd.nextInt(10,15));
}

/**
 * Подготовить массив случайных чисел
 * @param length
 * @return
 */

public static int[] prepareArray(int length){
    int [] array = new int[length];
    for(int i=0; i<length;i++){
        array[i]= rnd.nextInt(-99,100);
    }
    return array;
}
public static void printArray(int[] array){
    for(int element: array){
        System.out.printf(element + "\t");
    }
System.out.println("");
}

}