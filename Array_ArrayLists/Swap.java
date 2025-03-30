package JavaCodes.Array_ArrayLists;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1 , 3, 55, 321, 22 , 41};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
