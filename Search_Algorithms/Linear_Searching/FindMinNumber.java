package JavaCodes.Search_Algorithms.Linear_Searching;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] intArr = {2 , 313 ,233 , 3, -12 ,4, 664, 32, 1, 44,22, 42, -11};
        System.out.println(min(intArr));
    }


    //assume arr.lenght != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = (arr[i] < min)? arr[i] : min;
        }
        return min;
    }
}
