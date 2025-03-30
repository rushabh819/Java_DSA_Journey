package JavaCodes.Search_Algorithms.Binary_Searching;

public class MaxInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1,4};
        int[] arr2 = {48,77,35,99,17,48};
        System.out.println(findMaxInUnsortedSeries(arr2, 0 , arr2.length-1));
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
}
