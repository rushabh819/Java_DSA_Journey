package JavaCodes.Search_Algorithms.LeetCodes;

import java.util.Arrays;

public class FindPeakElementII {
    public static void main(String[] args) {
        int[][] mat1 =   {
                            {47,30,35,8,25},
                            {6,36,19,41,40},
                            {24,37,13,46,5},
                            {3,43,15,50,19},
                            {6,15,7,25,18}
                        };

        int[][] mat2 =   {
                            {48,36,35,17,48},
                            {38,28,38,26,24},
                            {15,9,33,32,6},
                            {49,4,8,10,41},
                        };
        
        int[][] mat3 = {
                            {7,2,3,1,2},
                            {6,5,4,2,1}
        };

        int[][] mat4 = {
                            {1,2,3,4,5,6,7,8,9},
                            {2,3,4,5,6,7,8,9,10},
                            {3,4,5,6,7,8,9,10,11},
                            {100,101,102,103,104,105,106,107,12},
                            {5,6,7,8,9,10,11,108,11},
                            {4,5,6,7,8,9,10,109,10},
                            {3,4,5,6,7,8,9,110,9},
                            {2,3,4,5,6,7,8,111,8},
                            {1,2,3,4,5,6,7,112,7}
        };
        System.out.println(Arrays.toString(findPeakGrid(mat1)));
    }

    // static int[] findPeakGrid(int[][] mat) {
    //     int[] ans = {-1,-1};
    //     int maxValue = -1;
    //     for(int i = 0 ; i < mat.length ; i++){
    //         int colMax = findMaxInUnsortedSeries(mat[i], 0 , mat[i].length-1);
            
    //         if (mat[i][colMax] > maxValue){
    //             maxValue = mat[i][colMax];
    //             ans[0] = i;
    //             ans[1] = colMax;
    //         }
    //     }
    //     return ans;
    // }

    static int[] findPeakGrid(int[][] mat) {
        int[] ans = {-1,-1};
        int maxValue = -1;
        for(int i = 0 ; i < mat.length ; i++){
            int colMax = findMaxInUnsortedSeries(mat[i], 0 , mat[i].length-1);
            if (mat[i][colMax] > maxValue){
                if  (colMax == 0) {
                    if(mat[i][colMax] < mat[i][colMax+1]) {
                        continue;
                    }
                    else{
                        maxValue = mat[i][colMax];
                        ans[0] = i;
                        ans[1] = colMax;
                    }
                }
                
                if  (colMax == mat[i].length-1){
                    if(mat[i][colMax] < mat[i][colMax-1]) {
                        continue;
                    }
                    else{
                        maxValue = mat[i][colMax];
                        ans[0] = i;
                        ans[1] = colMax;
                    }
                }
                
                if(colMax > 0 && colMax < mat[i].length-1){
                    if(mat[i][colMax] > mat[i][colMax + 1] && mat[i][colMax] > mat[i][colMax -1]){
                        maxValue = mat[i][colMax];
                        ans[0] = i;
                        ans[1] = colMax;
                    }
                    else{
                        continue;
                    }
                }
            }
            
            // if (mat[i][colMax] > maxValue){
            //     maxValue = mat[i][colMax];
            //     ans[0] = i;
            //     ans[1] = colMax;
            // }
        }
        return ans;
    }

    static int findMaxInUnsortedSeries(int[] arr, int start , int end){
        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] == arr[start] && arr[mid]== arr[end]){
                start++;
                end--;
            }
            else if(arr[mid] > arr[start]){
                start++;
            }
            else if(arr[mid] > arr[end]){
                end--;
            }
            else if(arr[start] > arr[end]){
                end--;
            }
            else if(arr[start] < arr[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return start;
    }

    // public int rotatedBS(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     int ans = -1;

    //     int pivot = findPivot(arr);
    //     if(pivot == -1){
    //         return binarySearch(arr, start , end);
    //     }

    //     if(target == arr[pivot]) return pivot;

    //     if(arr[start] > arr[pivot]){
    //         ans = binarySearch(arr, start , pivot-1);
    //     }
    //     if(ans == -1){
    //         return binarySearch(arr, pivot +1 , end);
    //     }
    //     return ans;
    // }

    // public int findPivot(int[] arr){
    //     int start = 0;
    //     int end = arr.length-1;
        
    //     while (start < end){
    //         int mid = start + (end - start)/2;

    //         if(mid < end && arr[mid] > arr[mid+1]){
    //             return mid;
    //         }
    //         if(mid > start && arr[mid-1] > arr[mid]){
    //             return mid-1;
    //         }
    //         if(arr[start] >= arr[mid]){
    //             end = mid-1;
    //         }
    //         else{
    //             start = mid+1;
    //         }
    //     }
    //     return start;
    // }
    // public int binarySearch(int[] arr, int target, int start , int end){

    //     while (start < end){
    //         int mid = start + (end - start)/2;
    //         if(target > arr[mid]){
    //             start = mid +1;
    //         }
    //         else if (target < arr[mid]){
    //             end = mid;
    //         }
    //         else{
    //             return -1;
    //         }
    //     }
    //     return -1;
    // }
}
