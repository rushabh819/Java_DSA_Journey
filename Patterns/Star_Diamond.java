package JavaCodes.Patterns;

public class Star_Diamond {

    public static void nStarDiamond(int n) {
        // Write your code here
        for (int i = 0 ; i < n ; i++) {
            for (int j = n-1 ; j >i ; j--) System.out.print(" ");
            for (int k = 0 ; k <= i ; k++) System.out.print("*");
            for (int l = 0 ; l <= i-1 ; l++) System.out.print("*");
            System.out.println();
        }
        for (int i = 0 ; i < n ; i++){
            for (int j = n-i-1 ; j < n-1 ; j++)System.out.print(" ");
            for (int k = 0 ; k < n-i ; k++)System.out.print("*");
            for (int l = 0 ; l < n-i-1 ; l++)System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nStarDiamond(3);
    }
}
