package JavaCodes.Search_Algorithms.Binary_Searching;
/*
 * 
 * Main task is to find the pivot in the rotated array
 * later we can apply normal BS to the both sides of the pivot
 * in case pivot = -1 : array is not rotated
 *          pivot != -1 : array is rotated
 * 
 * 
 * 
 * Array needs to be having distinct values 
 * otherwise in the case 4 
 * the code won't be able 
 * to generate correct output
 * 
 * 
 */
public class RotatedBinarySearch {
    /*
     * This will only work of the arrays with distinct values.
     */
    public static void main(String[] args) {
        // int[] arr = {4,5,6,7,0,1,2};
        // int[] arr = {1,3};
        // int[] arr = {3,1};
        // int[] arr = {5,1,3};
        int[] arr = {9, 1,4,5,7};

        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        if(start == end){
            return start;
        }
        
        while (start <= end) {
            int mid = start + (end - start)/2;

            // 4 cases over here
            

            /* Case 1
             * 
             * if the mid element is greater than the next element,
             * then the mid element is pivot point as after pivot point
             * the series start again.
             * 
             * to make sure that this case dont give the indexOutOfBound
             * error we used the case with mid < end condition using 
             * end operator.
             */

            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            /* Case 2
             * 
             * if the mid element is less then the element in previous position.
             * then the element at previous position will be the pivot, as we can 
             * say that the series will start again from mid poition so the previous
             * one will be the pivot of the series.
             * 
             * to make sure that this case dont give the indexOutOfBound
             * error we used the case with end > mid condition using 
             * end operator.
             */

            if(mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
                // we can interpret like this too:
                // if(mid > start && arr[mid-1 ] > arr[mid]) return mid-1;
            }

            /* Case 3
             * 
             * Lets take a case where the element at mid position is less than
             * the element at the start position. In this case we can say that the pivot 
             * will be in between start and mid positions. We are ignoring the elements 
             * at the poition after mid because they will always be less than the element
             * at start position as the series is the rotated series.
             * we can do this by making the end = mid-1.
             */
            
            
            /* Case 4
             * 
             * If the case 3 is not true than the element at the mid position will be greater
             * than the start. So can we not just ignore the element residing in between 
             * start and mid position? yes ofc. We can do so by making start = mid + 1;
             */

            if(arr[mid] <= arr[start]){ // case 3
            end = mid-1;
            } else{ // case 4
            start = mid +1;
            }

        }

        return -1;
        /*
         * if the return == -1 that means that the given array of integers is not rotated.
         */
    }
}
