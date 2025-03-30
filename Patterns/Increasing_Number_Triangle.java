package JavaCodes.Patterns;

public class Increasing_Number_Triangle {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int m = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nNumberTriangle(7);
    }
}
