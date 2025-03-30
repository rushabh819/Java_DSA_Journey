// https://leetcode.com/problems/find-in-mountain-array

package JavaCodes.Search_Algorithms.LeetCodes;

import java.util.ArrayList;


class MountainArray {
    ArrayList<Integer> newArr = new ArrayList<>();
    MountainArray(int[] arr){
        for(int i : arr){
            newArr.add(i);
        }
    }
    public int length() {
        return newArr.size();
    }

    public int get(int index) {
        return newArr.get(index);
    } 
}


public class FindInMountain {
    public static void main(String[] args) {
        MountainArray mountainArray = new MountainArray(new int[]{1,2,3,4,5,3,1});

        System.out.println(findInMountainArray(3, mountainArray));
    }

    static int findInMountainArray(int target, MountainArray mountainArr) {
        int maxElementIndex = findMountainMax(mountainArr);
        int start;
        int end;

        if (mountainArr.get(maxElementIndex) == target) return maxElementIndex;
        
        start = 0 ; 
        end = maxElementIndex -1;

        int ans = search(mountainArr, target, start, end);

        if(ans == -1){
            start = maxElementIndex +1;
            end = mountainArr.length()-1;
            ans = search(mountainArr, target, start, end);
        }
        return ans;

    }

    static int findMountainMax(MountainArray mountainArr){  //find peak in mountain
        int start = 0;
        int end = mountainArr.length()-1;

        while (start < end){
            int mid = start + (end - start)/ 2;
            int elementAtMid = mountainArr.get(mid);
            int elementNextToMid = mountainArr.get(mid+1);
            
            
            
            if(elementAtMid > elementNextToMid){
                // descending order
                end = mid;
            }
            else{
                //Ascending order
                start = mid+1;
            }
        }

        return start;
    }

    static int search(MountainArray mountainArray , int target, int start, int end){  // OrderAgnosticBS
        
        // finding the order of sort
        boolean isAsc = mountainArray.get(start) < mountainArray.get(end);
        
        while (start <= end){
            // int mid = (start + end) / 2; // not good as in some cases for big arrays, 
                                            // mid value might exceeds the int range of java
            int mid = start + (end - start) / 2;

            if(mountainArray.get(mid) == target){
                return mid;
            }
            
            if (isAsc){
                if (target < mountainArray.get(mid)){
                    end = mid -1;      
                }else{
                    start = mid + 1;
                }
            } else {
                if (target > mountainArray.get(mid)){
                    end = mid - 1;      
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


