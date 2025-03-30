/*
 * Binary Search:
 * 
 * array must be sorted in ascending or descending order. (here Ascending)
 * 
 * Time Complexity: O(log2(N)) == 0(logN)
 * 
 */


package JavaCodes.Search_Algorithms.Binary_Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArr = {-19,-8,-1,2,3,5,12,15,17,20};
        int target = -1;
        System.out.println(binarySearch(sortedArr, target));
        // System.out.println(binarySearch(sortedArr, -19));
        // System.out.println(binarySearch(sortedArr, 1));
        // System.out.println(binarySearch(sortedArr, 15));
        // System.out.println(binarySearch(sortedArr, 99));
    }

    //return index
    //return -1 if not found
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // int mid = (start + end) / 2; // not good as in some cases for big arrays, 
                                            // mid value might exceeds the int range of java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid -1;       // for Descending: end=mid+1
            }else if (target > arr[mid]){
                start = mid + 1;    // for Descending: start = mid -1
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
