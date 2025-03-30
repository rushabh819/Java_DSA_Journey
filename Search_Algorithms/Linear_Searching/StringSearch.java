package JavaCodes.Search_Algorithms.Linear_Searching;

import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String s = "Mountains";
        char target = 'u';
        System.out.println(search(s, target, 0 , s.length()-1));
        System.out.println(search(s, target, 0 , 1));
        System.out.println(search(s, target, 2 , s.length()-1));
    }
    static boolean search(String str, char target, int start, int end){
        if(str.length() == 0){
            return false;
        }
        
        /* ************************************************** */
        
        // for (int i = 0 ; i < str.length() ; i++){
        //     if(target == str.charAt(i)){
        //         return true;
        //     }
        // }

        
        /* ************************************************* */
        
        // using for each loop
        // for(d-type(char) : d-type-arr(char[]))

        // for(char ch : str.toCharArray()){
        //     if(ch == target){
        //         return true;
        //     }
        // }

        /* **************************************************** */

        for (int i = start ; i <= end ; i++){
            if(target == str.charAt(i)){
                return true;
            }
        }



        return false;
    }


}
