// https://leetcode.com/problems/peak-index-in-a-mountain-array
// https://leetcode.com/problems/find-peak-element

package JavaCodes.Search_Algorithms.LeetCodes;

public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] nums = {0,10,5,2};
        // int[] nums = {1,2,3,4,5};
        System.out.println(peakIndexInMountainArray(nums));
    }
    static int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr);
    }
    static public int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                // we are in the descending order part
                // the mid element is greater than the next one
                // so mid element might be a possible answer.
                // so for further cheack, we will put the 
                // end pointer to the mid element as that could be a answer. 

                end = mid; 
            }
            else {
                // we are in the ascending order part
                // the mid element is less or smaller than the next element.
                // so the next element could be the possible answer.
                // so for further cheack, we will put the 
                // start pointer to the next element of mid element as that could be a answer.
                start  = mid +1;
            }
        }

        // at the end the start and end pointer will be pointing to the largest element of the list.
        // so index stored in any of the variable, start or end, will be the index of the largest element.
        return start;
    }
}
