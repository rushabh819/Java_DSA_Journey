package JavaCodes.Patterns;

import java.util.*;

public class nStarTriangle {
    
    public static void nStarTriangle(int n) {
        // Write your code here
        
        for (int i = 0 ; i < n ; i++){ 
            for (int j = 0 ; j< n - i -1; j++){
                //Begining spaces
                System.out.print(" ");
            }

            for (int j = 0 ; j< 2 * i + 1 ; j++){
                //Stars Printing
                System.out.print("*");
            }

            for (int j = 0 ; j< n - i -1; j++){
                // Endong spaces
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int userIn = new Scanner(System.in).nextInt();
        for (int i = 0 ; i < userIn ; i++){
            int n = new Scanner(System.in).nextInt();
            nStarTriangle(n);    
        }
    }

}
