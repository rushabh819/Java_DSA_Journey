// https://leetcode.com/problems/search-in-rotated-sorted-array

package JavaCodes.Search_Algorithms.LeetCodes;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {7,5,3,2,1};
        // int[] nums = {3,5,1};

        // System.out.println(findPivot(nums));
        // System.out.println(binarySearch(nums, 3, 1, nums.length-1));
        System.out.println(search(nums, 3));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){ //if the array is not rotated
            return binarySearch(nums, target, 0, nums.length-1);
        }
        // if pivot is not -1 means that now we have 2 ascending sorted arrays
        
        // case 1 --> if element at pivot is equal to target
        if(target == nums[pivot]) return pivot;

        // case 2 --> if target element is greater than the element at the start
        // then search space will be from start(0) to pivod -1
        // because all the numbers after pivot are less than the start 
        // and we dont need to search in that part.
        if(target >= nums[0]) return binarySearch(nums, target, 0, pivot-1);

        //case 3 --> if target element is less than the start than 
        // then search space will be from pivot+1 to end(len-1)
        // because all the numbers after pivot are less than the start.
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end){
            int m = start + (end - start)/2;

            if(target > nums[m]) start = m +1;
            else if(target < nums[m]) end = m-1;
            else return m;
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
        
            if(mid < end && arr[mid] > arr[mid +1]) return mid;

            if(mid > start && arr[mid] < arr[mid-1]) return mid-1;

            if(arr[start] >= arr[mid]) end = mid-1;
            else start = mid +1;
        }
        
        return -1;
    }
}