/*
 * Celling: smallest element's index in array greater or equal to the target number
 */

package JavaCodes.Search_Algorithms;

public class Celling_Of_A_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        // target = 14 ; celling = 14
        // target = 15 ; celling = 16
        // target = 4 ; celling = 5
        // target = 9 ; celling = 9
        
        System.out.println(celling(arr, 19)); 
        
        
    }

    static int celling(int[] nums, int target){
        if(target > nums[nums.length-1]) return -1;
        int s = 0;
        int e = nums.length - 1;
        boolean isAsc = nums[0] < nums[nums.length-1];
        while (s <= e){
            int m = s + (e - s)/2;

            if(nums[m] == target) return m;


            if(isAsc){
                if(target > nums[m]){
                    s = m +1;
                }
                else{
                    e = m-1;
                }
            }
            else{
                if(target < nums[m]){
                    s = m +1;
                }
                else{
                    e = m-1;
                }
            }
            
        }
        
        return s; //start pos because that is the condition of breaking of the loop
                        //So the element at start will be the position just 
                        // greater that or equal to the target and so start will be the Ans
                        // Here we can say that s will be the position the element which is 
                        // just smallest element in array which greater than or equal to target.
    }
}
