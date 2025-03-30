// https://leetcode.com/problems/concatenation-of-array/

package JavaCodes.LeetCodes;

import java.util.Arrays;

public class Concatation_Of_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int[] newArr = new int[2*nums.length];
        for (int i = 0 ; i<nums.length; i++){
            newArr[i] = nums[i];
        }
        for (int i = nums.length, k=0 ; i < 2*nums.length ; i++, k++){
            newArr[i] = nums[k];
        }
        return newArr;
    }
}
