package JavaCodes.Patterns;

public class Number_Crown {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            }
            for (int k = n - i + 1 ; k > 1 ; k--){
                System.out.print("  ");
            }
            for (int k = n - i + 1 ; k > 1 ; k--){
                System.out.print("  ");
            }
            for(int l = 1 ; l <= i ; l++){
                System.out.print(i - l + 1+ " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        numberCrown(6);
    }
}
