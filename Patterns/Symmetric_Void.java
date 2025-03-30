package JavaCodes.Patterns;

public class Symmetric_Void {
    public static void symmetry(int n) {
        // Write your code here
        for(int i = 0 ; i < 2 * n; i ++){
            if(i < n){
                for(int j = 0 ; j < n - i; j++){
                    System.out.print("*");
                }
                for(int j = 0 ; j < i ; j++){
                    System.out.print(" ");
                }
                for(int j = 0 ; j < i ; j++){
                    System.out.print(" ");
                }
                for(int j = 0 ; j < n - i; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = n ; j <= i ; j++){
                    System.out.print("*");
                }
                for(int j = i ; j < 2 * n - 1; j++){
                    System.out.print(" ");
                }
                for(int j = i ; j < 2 * n - 1; j++){
                    System.out.print(" ");
                }
                for(int j = n ; j <= i ; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        symmetry(3);
    }
}
