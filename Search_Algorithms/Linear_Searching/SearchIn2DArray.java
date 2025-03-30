package JavaCodes.Search_Algorithms.Linear_Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {13,2,44,52},
            {22,3,41,5,66,21},
            {13,33,78},
            {42,65}
        };

        int target = 44;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
