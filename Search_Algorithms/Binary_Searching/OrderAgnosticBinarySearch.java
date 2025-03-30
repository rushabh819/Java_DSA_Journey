/*
 * Here Agnostic BS says that if you are given an sorted Array
 * but you dont know wheather its in Ace or Desc order then
 * first check if the array is in which order...
 * and to check it, the best technique if to compare first and last element.
 * second will be to apply the BS to find the element using BS.
 */


package JavaCodes.Search_Algorithms.Binary_Searching;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] sortedArr = {-19,-8,-1,2,3,5,12,15,17,20}; //Asc sorted
        int[] sortedArr = {99,84,45,12,0,-1,-55,-87}; //Desc sorted

        int target = 45;

        System.out.println(orderAgnosticBinarySearch(sortedArr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0 ;
        int end = arr.length -1;
        
        // finding the order of sort
        boolean isAsc = arr[start] < arr[end];
        
        while (start <= end){
            // int mid = (start + end) / 2; // not good as in some cases for big arrays, 
                                            // mid value might exceeds the int range of java
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            
            if (isAsc){
                if (target < arr[mid]){
                    end = mid -1;      
                }else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;      
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}