// https://leetcode.com/problems/split-array-largest-sum

package JavaCodes.Search_Algorithms.LeetCodes;

/**
 * SplitArrayLargestSum
 */
public class SplitArrayLargestSum {

    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{7,2,5,10,8}, 2)); //18
        System.out.println(splitArray(new int[]{1,2,3,4,5}, 2)); //9
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        /*
         * 
         * we know that in any array 
         * 1. sum of all elements == largest max sum
         * [7,2,5,10,8] 
         * the minimum number partition can be done is only one 
         * and that is the array itself
         * the sum of all element will the largest sum.
         *  
         * 2. largest element in list == smallest max sum
         * [7,2,5,10,8]
         * the maximum number of partition that can be done 
         * on any array is equal to the number of elements; N.
         * And sum of every subarray will be the element itself.
         * From these list of sums, the maximum sum will be the 
         * on subarray having the largest element it and it will 
         * the smallest one from all other partition less than N
         * 
         */

        for (int i = 0 ; i < nums.length ; i++ ){
            start = Math.max(start, nums[i]); // min largest sum
            end += nums[i]; // max largest sum
        }

        //binary search
        while (start < end){
            // try for the middle potential ans.
            int mid = start + (end - start)/2;

            // calculate how many pieces you can divide this with max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums){
                if (sum + num > mid){ 
                    // if the current sum is greater than the mid
                    // means you cannot add in this subarraymake, a new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            //We got the pieces.
            if(pieces > k){ 
                // means we need to increase the value of mid 
                // so that more numbers can be added to a subarray 
                // for that we will start from mid+1
                start = mid+1;
            }
            else{
                // means that there are more numbers in subarray 
                // and we need to reduce its limit, we can do that 
                // by decreasing mid value and for that we will
                // the end bs at mid so the new mid will be less than 
                // the previous one.
                end = mid;
            }
        }

        // at the end of while loop, start/end will be same.
        // out ans will be the value of start/end.
        return end;
    }
    
}