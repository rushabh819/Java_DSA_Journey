// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/


package JavaCodes.Search_Algorithms;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 160;
        int ans = findPos(arr,target);

        System.out.println(ans);
    }

    static int findPos(int[] arr, int target) {
        // starting with the box size of 1
        int start = 0 ;
        int end = 1;

        while (target > arr[end]){
            int newStart = start +1;

            // doubling the size of the box by 2
            // end = previous end + box size *2
            // box size = end - (start -1)

            end = end + (end - start + 1) *2;
            start = newStart;
        }
        boolean isAsc = arr[end] > arr[start];
        
        return binarySearch(arr, target, start, end, isAsc);
    }

    static int binarySearch(int[] arr, int target , int start , int end, boolean isAsc){
        int s = start;
        int e = end;
        while (s <= e ){
            int m = s + (e-s)/2;
            
            if (arr[m] == target){
                return m;
            }
            
            if(isAsc){
                if(target < arr[m]){
                    e = m -1;
                }
                else{
                    s = m + 1;
                }
            }
            else{
                if(target > arr[m]){
                    e = m -1;
                }
                else{
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}
