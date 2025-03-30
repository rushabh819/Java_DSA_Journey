/*
 * Floor: biggest element's index in array lesser or equal to the target number
 */


package JavaCodes.Search_Algorithms;

public class Floor_Of_A_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        // target = 14 ; floor = 14
        // target = 15 ; floor = 14
        // target = 4 ; floor = 3
        // target = 9 ; floor = 9
        
        System.out.println(floor(arr, 1)); 
    }

    static int floor(int[] nums , int t){
        if(t < nums[0]) return -1;
        int s = 0;
        int e = nums.length - 1;
        boolean isAsc = nums[0] < nums[nums.length-1];
        while (s <= e){
            int m = s + (e - s)/2;

            if(nums[m] == t) return m;

            if(isAsc){
                if(t > nums[m]){
                    s = m +1;
                }
                else{
                    e = m-1;
                }
            }
            else{
                if(t < nums[m]){
                    s = m +1;
                }
                else{
                    e = m-1;
                }
            }
            
        }
        
        return e;
    }
}
