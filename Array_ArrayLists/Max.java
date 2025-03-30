package JavaCodes.Array_ArrayLists;

public class Max {
    public static void main(String[] args) {

        int[] arr = {1 , 3, 55, 321, 22 , 41};

        System.out.println(max(arr, 0 , arr.length-1)); // for finding max in selective section of an array

        System.out.println(max(arr)); // for finding max in the whole array
    }

    static int max(int[] arr, int start , int end) {
        
        if (start > end){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        
        int k = start;
        int maxInt = arr[k];
        if(k == end){
            return maxInt;
        }
        else {
            k++;
            arr[k] = (arr[k] > maxInt)? arr[k] : maxInt;
            return max(arr, k, end);
        }
    }

    static int max(int[] arr) {

        if(arr.length == 0){
            return -1;
        }

        int maxVal = arr[0];
        for (int i = 1; i < arr.length ; i++){
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}