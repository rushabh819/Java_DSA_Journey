package JavaCodes;

import java.util.* ;
import java.io.*;

public class Palindrome {
    public static boolean checkPalindrome(String str) {
	
	    // WRITE YOUR CODE HERE	

		StringBuffer str2 = new StringBuffer();
        for (int i = 0 ,j = 0; i < str.length() ; i++){
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                str2.append(Character.toLowerCase(str.charAt(i)));

            }
        }
        System.out.println(str2 + " " +str2.reverse());
        return str2.toString().equals(str2.reverse().toString());


		// for (int i = 0 , j = str.len() - 1; i < str.len() / 2 - 1 ; i++, j--){
		// 	if (str.charAt(i) == str.charAt(j)){
		// 		continue;
		// 	}
		// 	else{
		// 		return false;
		// 	}
		// }
		// return true;


	}    

    public static void main(String[] args) {
        System.out.println(new Palindrome().checkPalindrome("A1b22Ba"));
    }
}
