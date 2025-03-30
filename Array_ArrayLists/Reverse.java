package JavaCodes.Array_ArrayLists;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        
        int[] arr = {1 , 3, 55, 321, 22 , 41};

        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        
        while( start <end){
            //swap
            Swap.swap(arr, start, end);
            start++;
            end--;
        }

    }
}
