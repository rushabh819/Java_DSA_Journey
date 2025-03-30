package JavaCodes.Patterns;

import java.util.Scanner;

public class Reverse_Star_Triangle {

    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = 0 ; i < n ; i++){
            for (int j = n-i-1 ; j < n-1 ; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k < n-i ; k++){
                System.out.print("*");
            }
            for (int l = 0 ; l < n-i-1 ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int t = new Scanner(System.in).nextInt();

        for (int i = 0 ; i < t ; i++){
            int n = new Scanner(System.in).nextInt(); 
            nStarTriangle(n);
        }

        // nStarTriangle(3);
    }

}
