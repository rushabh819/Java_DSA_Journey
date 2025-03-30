package JavaCodes.Search_Algorithms.Linear_Searching;

import java.util.Arrays;

public class MinimumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {13,2,44,52},
            {22,3,41,5,66,21},
            {13,333,78},
            {42,65}
        };

        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         if (arr[row][col] > max) {
        //             max = arr[row][col];
        //         }
        //     }
        // }
        
        for(int[] rows: arr){
            for(int col : rows){
                if(col > max){
                    max = col;
                }
            }
        }

        return max;
    }
}
