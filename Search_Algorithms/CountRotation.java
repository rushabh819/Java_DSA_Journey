package JavaCodes.Search_Algorithms;

public class CountRotation {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        // int[] nums = {5,6,8,9,10,12,18};
        int n = nums.length;
        System.out.println(ans(nums, n));
    }

    static int ans(int[] arr, int n){
        int start = 0;
        int end = n-1;
        int pivot = findPivot(arr, start, end);
        
        return pivot+1;
    }

    static int findPivot(int[] arr, int start , int end){
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
