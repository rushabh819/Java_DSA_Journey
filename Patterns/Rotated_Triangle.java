package JavaCodes.Patterns;

public class Rotated_Triangle {
    public static void nStarTriangle(int n) {
        // Write your code here
        // for (int i = 0 ; i < 2 * n - 1 ; i++){
        //     if(i < n){
        //         for(int j = 0 ; j <= i ; j++){
        //             System.out.print("*");
        //         }
        //     }
        //     if(i >=n){
        //         for(int k = 2 * n-i -1; k > 0 ; k--){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = n-i ; j > 1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        nStarTriangle(3);
    }
}
