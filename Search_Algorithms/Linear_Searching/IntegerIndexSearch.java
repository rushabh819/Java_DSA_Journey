package JavaCodes.Search_Algorithms.Linear_Searching;

public class IntegerIndexSearch {
    public static void main(String[] args) {
        int[] intArr = {2 , 313 ,233 , 3, -12 ,4, 664, 32, 1, 44,22, 42, -11};
        int target = 664;
        
        System.out.println(linearSearch(intArr, target, 1 , 4));
    }

    // Search in the array and return the index if found
    // otherwise return -1

    static int linearSearch(int[] arr , int target , int start , int end){
        if (arr.length == 0){
            return -1;
        }

        //run the loop
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] == target){
                return index;
            }
        }

        return -1; //return -1(as index can never be -ve) or Integer.MAX_VALUE
    }

    // Time Complexity = O(n)
}
