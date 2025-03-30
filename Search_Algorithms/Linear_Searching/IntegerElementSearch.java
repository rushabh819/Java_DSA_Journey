package JavaCodes.Search_Algorithms.Linear_Searching;

public class IntegerElementSearch {
    public static void main(String[] args) {
        int[] intArr = {2 , 313 ,233 , 3, -12 ,4, 664, 32, 1, 44,22, 42, -11};
        // System.out.println(linearSearch(intArr, 313));
        System.out.println(linearSearch(intArr, 1));
        System.out.println(linearSearch(intArr, -23));
        System.out.println(linearSearch(intArr, 999));
    }

    // Search in the array and return the true or False if element is present 
    // otherwise return -1

    static boolean linearSearch(int[] arr , int target){
        if (arr.length == 0){
            return false;
        }

        //run the loop
        for(int element : arr){
            if(element == target){
                return true;
            }
        }

        return false; 
    }
}
