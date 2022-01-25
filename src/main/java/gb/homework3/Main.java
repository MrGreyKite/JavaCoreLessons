package gb.homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] arr2 = {"A", "B", "C"} ;
        System.out.println(Arrays.toString(swapTwoArrayElements(arr1,0,9)));
        System.out.println(Arrays.toString(swapTwoArrayElements(arr2,0,2)));

    }

    public static  <T> T[] swapTwoArrayElements(T[] array, int elem1, int elem2){
        T tempValue = array[elem1];
        array[elem1] = array[elem2];
        array[elem2] = tempValue;
        return array;
    }
}
