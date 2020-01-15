package Array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] integer = new int[10];
        printArray(integer);
        initializeArray(integer);
        printArray(integer);
        //bubbleSort(integer);
        bubbleSort2(integer);
        printArray(integer);
    }
    public static void bubbleSort2(int[] array){
        Arrays.sort(array);
    }

        public static void bubbleSort(int[] array){
            for (int j = 0; j <array.length ; j++) {


            for (int i = 0; i <array.length-1 ; i++) {
                if (array[i] > array[i + 1]) {
                    swapArrayValues(i, i + 1, array);

                }
                }
            }


        }
    private static void swapArrayValues(int i , int i1,int[] array){
        int temp = array[i];
        array[i]=array[i+1];
        array[i+1] = temp;
    }
        public static void printArray(int[] array){
            System.out.println(Arrays.toString(array));
        }
        public static void initializeArray(int[] array){
            for (int i = 0; i <array.length ; i++) {
                array[i]=10-i;
            }

    }

}
